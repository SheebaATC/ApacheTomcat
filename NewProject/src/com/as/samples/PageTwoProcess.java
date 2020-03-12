package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageTwoProcess
 */

public class PageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	   
   	String id= request.getParameter("id");
   	String course= request.getParameter("course");
   	
   	System.out.println("The ID is" +id);
   	System.out.println("The Course is" +course);
   	
   	
   	request.getSession().setAttribute("id", id);
   	request.getSession().setAttribute("course", course	);
   	
   	response.sendRedirect("jsp/PrintOut.jsp");
	   
	}

}
