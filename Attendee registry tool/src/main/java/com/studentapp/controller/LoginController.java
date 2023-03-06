package com.studentapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.model.DAOService;
import com.studentapp.model.DAOServiceImpl;


@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String Password=request.getParameter("password");

		DAOService service=new DAOServiceImpl();
		service.connectionDB();
		boolean status=service.verifyCredential(email, Password);
	if(status==true) {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/New_register.jsp");
		rd.forward(request, response);
	}else {
		request.setAttribute("error", "Invalid username/password");
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}
	}
	

}
