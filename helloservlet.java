package com.akash123;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/helloservlet")
public class helloservlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			out.write("<html><body>");
			out.write("<h1>Hello again!<h2>");
			out.write("<h2>Todays' date is= "+LocalDate.now()+"</h2>");
			out.write("</html></body>");
		}

	}


