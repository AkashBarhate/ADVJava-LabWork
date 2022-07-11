/*

Q1.Need of Servlet?

Today we all are aware of the need of creating dynamic web pages i.e the ones which 
have the capability to change the site contents according to the time or are able to 
generate the contents according to the request received by the client. And 
to generate dynamic web pages we use Java Servlet.
 

Q2.What is servlet?

Servlets are the Java programs that run on the  web server.
They are used to handle the request obtained from the webserver,and mainly 
for process the request, produce the response, then send a response back to 
the webserver. 
Webserver  used to run web application. Inside webserver webcontainer is there
generally we use Tomcat, Webcontainer Manages and executes servlet and jsp.


Q3.Ways to make servlet?

We can make servlet by using 3 ways:-
1) By implementing Servlet interface.
2) By extending httpServlet class.
3) By extending GenericServlet class.

 
Q4.Why we are use By extending HttpServlet class?

Because we don't have to override other methods of httpservlet class
those method are available to us by inharitance. But in case of Implementing
we have to override all methods.


Q5.How does execution of servlet takes place?

Execution of Servlets basically involves six basic steps: 
1].The clients send the request to the webserver.
2].The web server receives the request.
3].The web server passes the request to the corresponding servlet.
4].The servlet processes the request and generates the response in the form of output.
5].The servlet sends the response back to the webserver.
6].The web server sends the response back to the client and the client browser displays it on the screen.

Q6.Life Cycle of Servlet?
Web Container maintains the life cycle of servlets,
1. Servlet Class is Loaded.
2. Servlet instance is created.
3. Init method is Invoked.
4. Service method is invoked.(Service methods:-doGet(),doPost();
5. Destroy method is invoked.





*/




/*--------------------------Hello Servlet Code---------------------------------*/

package com.akash123;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloservlet1
 */
@WebServlet("/helloservlet1")
public class helloservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter(); // to write anything in your browser
		String s =request.getParameter("t1"); //to access value in text box and store it in s
		out.write("<html><body>");
		out.write("<h1>Hello " +s);
		out.write("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
