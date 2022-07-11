package com.akash123;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/birthdate")
public class bithdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1999, Month.DECEMBER, 27);
		
		Period p=Period.between(birthday, today);
		out.write("<html><body>");
		out.write("<h2> My Age is: " +"year: "+p.getYears()+"Months: "+p.getMonths()+"Days: "+p.getDays()+"</h2>");
		out.write("</html></body>");
	}

}
