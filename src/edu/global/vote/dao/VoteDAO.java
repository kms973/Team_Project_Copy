package edu.global.vote.dao;

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
import edu.global.vote.dto.VoteInspectDTO;
import edu.global.vote.dto.VoteRankDTO;
import edu.global.vote.dto.VoteSearchDTO;

public class VoteDAO {

	private DataSource datasource = null;

	// 투표-기본
	public VoteDAO() {
		try {

			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// 투표-후보조회
	public List<VoteSearchDTO> voteSearch() {
		ArrayList<VoteSearchDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select d.\"M_NO\" AS M_NO,d.\"M_NAME\" AS M_NAME,a.\"P_NAME\" as P_NAME, \r\n"
					+ "case when substr(d.P_SCHOOL,1,1) = '1' then '고졸'\r\n"
					+ "         when substr(d.P_SCHOOL,1,1) = '2' then '학사'\r\n"
					+ "         when substr(d.P_SCHOOL,1,1) = '3' then '석사'\r\n" + "end as P_SCHOOL,\r\n"
					+ "substr(d.\"M_JUMIN\",1,6)||'-'||substr(d.\"M_JUMIN\",7,14) AS M_JUMIN,d.\"M_CITY\" AS M_CITY,a.\"P_TEL1\"||'- '||a.\"P_TEL2\"||' - '||a.\"P_TEL3\" as P_TEL\r\n"
					+ "from TBL_PARTY_202005 a, TBL_MEMBER_202005 d\r\n" + "where a.P_CODE=d.P_CODE";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int mno = rs.getInt("M_NO");
				String mName = rs.getString("M_NAME");
				String pName = rs.getString("P_NAME");
				String pSchool = rs.getString("P_SCHOOL");
				String mJumin = rs.getString("M_JUMIN");
				String mCity = rs.getString("M_CITY");
				String tel = rs.getString("P_TEL");

				VoteSearchDTO voteSearchDto = new VoteSearchDTO(mno, mName, pName, pSchool, mJumin, mCity, tel);
				dtos.add(voteSearchDto);
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

	// 투표-투표검수조회
	public List<VoteInspectDTO> voteInspect() {
		ArrayList<VoteInspectDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select V_NAME AS V_NAME, 19||substr(V_JUMIN,1,2) ||'년'|| substr(V_JUMIN,3,2)||'월'||substr(V_JUMIN,3,2)||'일생' as BIRTHDAY, \r\n"
					+ "floor(months_between(sysdate,to_date(substr(V_JUMIN,1,6)))/12) as AGE,\r\n"
					+ "case when substr(V_JUMIN,7,1) = '1' then '남'\r\n"
					+ "         when substr(V_JUMIN,7,1) = '2' then '여'\r\n" + "end as GENDER, \r\n"
					+ "M_NO AS VOTE_NUMBER, substr(V_TIME,1,2)||':'||substr(V_TIME,3,4) as VOTE_TIME,\r\n"
					+ "case when substr(V_CONFIRM,1,1) = 'N' then '미확인'\r\n"
					+ "         when substr(V_CONFIRM,1,1) = 'Y' then '확인'\r\n" + "end as VOTER_INSPECT\r\n"
					+ "from tbl_vote_202005";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String vName = rs.getString("V_NAME");
				String birthday = rs.getString("BIRTHDAY");
				int age = rs.getInt("AGE");
				String gender = rs.getString("GENDER");
				int voteNumber = rs.getInt("VOTE_NUMBER");
				String voteTime = rs.getString("VOTE_TIME");
				String voterInspect = rs.getString("VOTER_INSPECT");

				VoteInspectDTO voteInspectDto = new VoteInspectDTO(vName, birthday, age, gender, voteNumber, voteTime,
						voterInspect);
				dtos.add(voteInspectDto);
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

	// 투표-후보자등수
	public List<VoteRankDTO> voteRank() {
		ArrayList<VoteRankDTO> dtos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String query = "select d.M_NO AS M_NO, d.M_NAME AS M_NAME, count(d.\"M_NO\") as COUNT\r\n"
					+ "from tbl_vote_202005 a, TBL_MEMBER_202005 d\r\n" + "where a.M_NO=d.M_NO\r\n"
					+ "group by d.M_NAME, d.M_NO\r\n" + "order by COUNT desc";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				int mno = rs.getInt("M_NO");
				String mName = rs.getString("M_NAME");
				int count = rs.getInt("COUNT");

				VoteRankDTO voteRankDto = new VoteRankDTO(mno, mName, count);
				dtos.add(voteRankDto);
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

	public void vote(String vJumin, String vName, String mno, String vTime, String vArea, String vConfirm) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			String query = "insert into tbl_vote_202005 (v_jumin, v_name, m_no, v_time, v_area, v_confirm)\r\n"
					+ "values(?,?,?,?,?,?)";

			con = datasource.getConnection();

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, vJumin);
			pstmt.setString(2, vName);
			pstmt.setString(3, mno);
			pstmt.setString(4, vTime);
			pstmt.setString(5, vArea);
			pstmt.setString(6, vConfirm);
			
			//pstmt.executeUpdate();

				int rn = pstmt.executeUpdate();
				System.out.println(rn);
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
