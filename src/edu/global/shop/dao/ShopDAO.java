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

public class ShopDAO {

	private DataSource datasource = null;

	// 투표-기본
	public ShopDAO() {
		try {

			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// 투표-기본
	public List<ClassDTO> searchClasses() {
		ArrayList<ClassDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "SELECT * FROM TBL_CLASS_202201";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String registMonth = rs.getString("regist_month");
				int cno = rs.getInt("C_NO");
				String classArea = rs.getString("class_area");
				int tuition = rs.getInt("tuition");
				String teacherCode = rs.getString("teacher_code");

				ClassDTO classDto = new ClassDTO(registMonth, cno, classArea, tuition, teacherCode);
				dtos.add(classDto);
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

}
