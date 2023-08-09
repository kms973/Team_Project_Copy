package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.command.BoardCommand;
import edu.global.golf.dao.ClassDAO;
import edu.global.golf.dto.ClassDTO;
import edu.global.golf.dto.TeacherDTO;
import edu.global.shop.dao.ShopDAO;
import edu.global.shop.dto.MemberSalDTO;
import edu.global.vote.dao.VoteDAO;
import edu.global.vote.dto.VoteInspectDTO;
import edu.global.vote.dto.VoteSearchDTO;

public class CreateMemberCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("CreateMemberCommand entry.."); // 디버깅을 위한 코드

//	      String bid = request.getParameter("bid"); 
		
		String custName = request.getParameter("custName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");

		ShopDAO shopDao = new ShopDAO();
		
		shopDao.createMember(custName, phone, address, grade, city);

//	      List<MemberSalDTO> dtos = shopDao.memberSal();

		// request에 담긴 데이터를 BController에서 forwarding으로 넘김으로써
		// dto객체를 content_view.jsp에서 사용할 수 있도록 한다.
//	      request.setAttribute("memberSal", dtos);
	}

}
