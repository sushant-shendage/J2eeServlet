package com.org7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/caldata")
public class CalculatorAssignmetsept23 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String num1=req.getParameter("num1");
		 String num2=req.getParameter("num2");
		 
		  
		try {
		 int n1=Integer.parseInt(num1);
		 int n2=Integer.parseInt(num2);
		 
			RequestDispatcher rd= req.getRequestDispatcher("calres");
			rd.forward(req, resp);
		 
		}
		catch(NumberFormatException nfe) 
		{
			PrintWriter pw=resp.getWriter();
			pw.print("<h1>You have given wrong inputs ..!</h1>");
			pw.print("<h1>please enter integer numbers only..!</h1>");

			RequestDispatcher rd= req.getRequestDispatcher("CalculatorAssignmentSept23.html");
			rd.include(req, resp);
		}
		
		 
		
		 

	}

}
