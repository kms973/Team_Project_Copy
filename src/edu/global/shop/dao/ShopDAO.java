package edu.global.shop.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.golf.dto.ClassDTO;
import edu.global.golf.dto.MemberDTO;
import edu.global.golf.dto.MemberInfoSearchDTO;
import edu.global.golf.dto.TeacherDTO;
import edu.global.golf.dto.TeacherSalDTO;
import edu.global.shop.dto.CustListDTO;
import edu.global.shop.dto.MemberSalDTO;

public class ShopDAO {

	private DataSource datasource = null;

	// 쇼핑몰-기본
	public ShopDAO() {
		try {

			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// 쇼핑몰-조인
	public List<MemberSalDTO> memberSal() {
		ArrayList<MemberSalDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select a.custno as CUSTNO, a. custname as CUSTNAME,\r\n"
					+ "case when substr(a.grade,1,1) = 'A' then 'VIP'\r\n"
					+ "         when substr(a.grade,1,1) = 'B' then '일반'\r\n"
					+ "         when substr(a.GRADE,1,1) = 'C' then '직원'\r\n" + "end as CUST_GRADE,\r\n"
					+ "sum(d.price) as SAL\r\n" + "from MEMBER_TBL_02 a, MONEY_TBL_02 d\r\n"
					+ "where a.custno = d. custno\r\n" + "group by a.custno, a.custname, a.GRADE\r\n"
					+ "order by SAL desc";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				int custNo = rs.getInt("CUSTNO");
				String custName = rs.getString("CUSTNAME");
				String custGrade = rs.getString("CUST_GRADE");
				int sal = rs.getInt("SAL");

				MemberSalDTO memberSalDto = new MemberSalDTO(custNo, custName, custGrade, sal);
				dtos.add(memberSalDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}

	// 쇼핑몰-조인
	public List<CustListDTO> custList() {
		ArrayList<CustListDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "SELECT custno as CUSTNO, custname as CUSTNAME,\r\n"
					+ "phone as PHONE, address as ADDRESS, 20||joindate as JOINDATE,\r\n"
					+ "case when substr(grade,1,1) = 'A' then 'VIP'\r\n"
					+ "         when substr(grade,1,1) = 'B' then '일반'\r\n"
					+ "         when substr(grade,1,1) = 'C' then '직원'\r\n" + "end as CUSTGRADE, \r\n"
					+ "CITY as CITY\r\n" + "FROM  MEMBER_TBL_02";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				int custNo = rs.getInt("CUSTNO");
				String custName = rs.getString("CUSTNAME");
				String phone = rs.getString("PHONE");
				String address = rs.getString("ADDRESS");
				String joinDate = rs.getString("JOINDATE");
				String custGrade = rs.getString("CUSTGRADE");
				int city = rs.getInt("CITY");

				CustListDTO custListDto = new CustListDTO(custNo, custName, phone, address, joinDate, custGrade, city);
				dtos.add(custListDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}
	
	
	public void createMember(String custName, String phone, String address, String grade, String city) {
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			String query = "INSERT INTO MEMBER_TBL_02 (custno, custname, phone, address, joindate, grade, city)\r\n" + 
					"values ((SELECT MAX(custno) + 1 FROM MEMBER_TBL_02), ?, ?, ?, sysdate, ?, ?)";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, custName);
			pstmt.setString(2, phone);
			pstmt.setString(3, address);
			pstmt.setString(4, grade);
			pstmt.setString(5, city);
			
			pstmt.executeUpdate();
			
//			int rn = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
