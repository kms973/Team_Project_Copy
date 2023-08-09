package edu.global.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.command.BoardCommand;
import edu.global.ex.command.CreateMemberCommand;
import edu.global.ex.command.CustListCommand;
import edu.global.ex.command.ListCommand;
import edu.global.ex.command.MemberInfoSearchCommand;
import edu.global.ex.command.MemberSalCommand;
import edu.global.ex.command.TeacherSalCommand;
import edu.global.ex.command.TeacherSearchCommand;
import edu.global.ex.command.VoteCommand;
import edu.global.ex.command.VoteInspectCommand;
import edu.global.ex.command.VoteRankCommand;
import edu.global.ex.command.VoteSearchCommand;

/**
 * Servlet implementation class Control
 */
@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() ..");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() ..");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo() ..");

		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		BoardCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		System.out.println("컨텍스트 패스" + com);

		if (com.equals("/list.do")) {
			command = new ListCommand();
			command.execute(request, response);

			viewPage = "index.jsp";

		} else if (com.equals("/teachersearch.do")) { // 강사조회
			command = new TeacherSearchCommand();
			command.execute(request, response);

			viewPage = "TeacherSearch.jsp";

		} else if (com.equals("/memberinfosearch.do")) { // 회원정보조회
			command = new MemberInfoSearchCommand();
			command.execute(request, response);

			viewPage = "MemberInfoSearch.jsp";

		} else if (com.equals("/teachersal.do")) { // 강사매출
			command = new TeacherSalCommand();
			command.execute(request, response);

			viewPage = "TeacherSal.jsp";
		} else if (com.equals("/votesearch.do")) { // 후보조회
			command = new VoteSearchCommand();
			command.execute(request, response);

			viewPage = "VoteSearch.jsp";
		} else if (com.equals("/voteinspect.do")) { // 투표검수조회
			command = new VoteInspectCommand();
			command.execute(request, response);

			viewPage = "VoteInspect.jsp";
		} else if (com.equals("/voterank.do")) { // 후보자등수
			command = new VoteRankCommand();
			command.execute(request, response);

			viewPage = "VoteRank.jsp";
		} else if (com.equals("/membersal.do")) { // 회원매출조회
			command = new MemberSalCommand();
			command.execute(request, response);

			viewPage = "MemberSal.jsp";
		} else if (com.equals("/custlist.do")) { // 회원목록조회
			command = new CustListCommand();
			command.execute(request, response);

			viewPage = "CustList.jsp";
		} else if (com.equals("/createmember.do")) { // 회원생성
			command = new CreateMemberCommand();
			command.execute(request, response);

			viewPage = "CustList.jsp";
		} else if (com.equals("/vote.do")) { // 투표
			command = new VoteCommand();
			command.execute(request, response);

			viewPage = "CustList.jsp";
		} else if (com.equals("/creatememberform.do")) { // 회원생성페이지
			command = new VoteCommand();
			command.execute(request, response);

			viewPage = "CreateMemberForm.jsp";
		} else if (com.equals("/voteform.do")) { // 투표페이지
			command = new VoteCommand();
			command.execute(request, response);

			viewPage = "VoteForm.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
