package com.org7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calres")
public class CalResults extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 String num1=req.getParameter("num1");
	 String num2=req.getParameter("num2");
	 
	 int n1=Integer.parseInt(num1);
	 int n2=Integer.parseInt(num2);
	 
	PrintWriter pw=resp.getWriter();
	pw.print("<pre>");
	pw.print("          num1     :: "+(n1)+" num2 :: "+(n2)+"<br>");
	pw.print("       Additio     :: "+(n1+n2)+" <br>");
	pw.print("    subtraction    :: "+(n1-n2)+" <br>");
	pw.print("    Multiplication :: "+(n1*n2)+" <br>");
	pw.print("    Division       :: "+(((float)n1/n2))+" <br>");
	pw.print("</pre>");

	
	pw.print("<a href='CalculatorAssignmentSept23.html'>Click here...</a>");
	
	 
	
	 
}
}
