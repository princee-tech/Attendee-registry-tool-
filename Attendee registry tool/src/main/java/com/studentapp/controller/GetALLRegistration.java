package com.studentapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.model.DAOService;
import com.studentapp.model.DAOServiceImpl;

/**
 * Servlet implementation class GetALLRegistration
 */
@WebServlet("/listAll")
public class GetALLRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetALLRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAOService service=new DAOServiceImpl();
		service.connectionDB();
	ResultSet result=	service.listRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/list_all.jsp");
	rd.forward(request, response);
	}
	







	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
