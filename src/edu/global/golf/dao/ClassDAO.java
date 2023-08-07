package edu.global.golf.dao;

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

public class ClassDAO {

	private DataSource datasource = null;
	//골프-기본
	public ClassDAO() {
		try {

			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

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
	//골프-기본
	public List<MemberDTO> searchMembers() {
		ArrayList<MemberDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "SELECT * FROM TBL_MEMBER_202201";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				int cno = rs.getInt("C_NO");
				String cname = rs.getString("C_NAME");
				String phone = rs.getString("PHONE");
				String address = rs.getString("ADDRESS");
				String grade = rs.getString("GRADE");

				MemberDTO memberDto = new MemberDTO(cno, cname, phone, address, grade);
				dtos.add(memberDto);
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
	//골프-기본
	public List<TeacherDTO> searchTeachers() {
		ArrayList<TeacherDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "SELECT * FROM TBL_TEACHER_202201";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String teacherCode = rs.getString("TEACHER_CODE");
				String teacherName = rs.getString("TEACHER_NAME");
				String className = rs.getString("CLASS_NAME");
				int classPrice = rs.getInt("CLASS_PRICE");
				String teacherRegistDate = rs.getString("TEACHER_REGIST_DATE");

				TeacherDTO teacherDto = new TeacherDTO(teacherCode, teacherName, className, classPrice,
						teacherRegistDate);
				dtos.add(teacherDto);
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
	//골프-조인
	public List<MemberInfoSearchDTO> searchMemberInfo() {
		ArrayList<MemberInfoSearchDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select b.regist_month as REGIST_MONTH, a.c_no as C_NO, a.c_name as C_NAME, c.class_name as CLASS_NAME, b.class_area as CLASS_AREA, c.class_price as CLASS_PRICE, a.grade as GRADE\r\n"
					+ "from  TBL_MEMBER_202201 a, TBL_CLASS_202201 b, TBL_TEACHER_202201 c\r\n"
					+ "where a.c_no = b.c_no and b.teacher_code = c.teacher_code ";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String registMonth = rs.getString("REGIST_MONTH");
				int cno = rs.getInt("C_NO");
				String cname = rs.getString("C_NAME");
				String className = rs.getString("CLASS_NAME");
				String classArea = rs.getString("CLASS_AREA");
				int classPrice = rs.getInt("CLASS_PRICE");
				String grade = rs.getString("GRADE");

				MemberInfoSearchDTO memberinfoDto = new MemberInfoSearchDTO(registMonth, cno, cname, className,
						classArea, classPrice, grade);
				dtos.add(memberinfoDto);
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

	//골프 - 조인
	public List<TeacherSalDTO> teacherSal() {
		ArrayList<TeacherSalDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select a.TEACHER_CODE AS TEACHER_CODE, a.CLASS_NAME AS CLASS_NAME, a.TEACHER_NAME AS TEACHER_NAME, TO_CHAR((SUM(d.TUITION)),'l999,999') AS TUITION\r\n" + 
					"from TBL_TEACHER_202201 a,TBL_CLASS_202201 d\r\n" + 
					"where a.TEACHER_CODE=d.TEACHER_CODE\r\n" + 
					"group by a.TEACHER_CODE, a.CLASS_NAME, a.TEACHER_NAME, d.TUITION\r\n" + 
					"order by a.TEACHER_CODE";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				 int teacherCode = rs.getInt("TEACHER_CODE");
				 String className = rs.getString("CLASS_NAME");
				 String teacherName = rs.getString("TEACHER_NAME");
				 String sal = rs.getString("TUITION");

				TeacherSalDTO teacherSalDto = new TeacherSalDTO(teacherCode, className, teacherName, sal);
				dtos.add(teacherSalDto);
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
