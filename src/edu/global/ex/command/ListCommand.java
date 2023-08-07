package edu.global.ex.command;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.command.BoardCommand;
import edu.global.golf.dao.ClassDAO;
import edu.global.golf.dto.ClassDTO;

public class ListCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ClassDAO boardDao = new ClassDAO();
		
		List<ClassDTO> dtos = boardDao.searchClasses();
		
		
		request.setAttribute("searchClasses", dtos);
	}

}
