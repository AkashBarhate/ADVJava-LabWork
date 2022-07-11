package com.akash123;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class loginServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String captcha = request.getParameter("captcha");
		//LoginService loginService =new LoginService();
		
		//boolean isValid = loginService.loginCheck(username,password);
			Loginall li=new Loginall();
			boolean isValid=li.checkLogin(username,password,captcha);
			if(isValid)
				response.sendRedirect("welcome.html");
			else
				response.sendRedirect("SignIn.html");
		
	}

}	