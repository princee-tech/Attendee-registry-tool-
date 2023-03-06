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
 * Servlet implementation class NewRegistrationController
 */
@WebServlet("/NewReg")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewRegistrationController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/New_register.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		DAOService service=new DAOServiceImpl();
		service.connectionDB();
		service.saveReg(name,city,email,mobile);
		request.setAttribute("msg", "Record is Saved!");
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/New_register.jsp");
		rd.forward(request, response);
			
			
			
	}

}
