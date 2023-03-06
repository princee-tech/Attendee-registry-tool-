package com.studentapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Update")
public class Update_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Update_Controller() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=	request.getParameter("email");
	String mobile=	request.getParameter("mobile");
	request.setAttribute("email", email);
	request.setAttribute("mobile", mobile);
	RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/update_reg.jsp");
	rd.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
