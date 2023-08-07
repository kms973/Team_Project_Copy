package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.command.BoardCommand;
import edu.global.golf.dao.ClassDAO;
import edu.global.golf.dto.ClassDTO;
import edu.global.golf.dto.MemberDTO;
import edu.global.golf.dto.MemberInfoSearchDTO;
import edu.global.golf.dto.TeacherDTO;

public class MemberInfoSearchCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("MemberInfoSearchCommand entry.."); // 디버깅을 위한 코드

//	      String bid = request.getParameter("bid"); 

		ClassDAO ClassDao = new ClassDAO();

		List<MemberInfoSearchDTO> memberdtos = ClassDao.searchMemberInfo();

		// request에 담긴 데이터를 BController에서 forwarding으로 넘김으로써
		// dto객체를 content_view.jsp에서 사용할 수 있도록 한다.
		request.setAttribute("searchMemberInfo", memberdtos);
	}

}
