package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberPlus")
public class Ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		int sum = 0;
		// 문자열 -> 정수변환 : Integer.parseInt()
		String num1 = request.getParameter("num1");
		int i = Integer.parseInt(num1);
		String num2 = request.getParameter("num2");
		int j = Integer.parseInt(num2);

		// int num1 = Integer.parseInt(request.getParameter("num1"));
		// int num2 = Integer.parseInt(request.getParameter("num2"));

		sum = i + j;

		System.out.println("첫 번째 전달받은 값 : " + num1);
		System.out.println("두 번째 전달받은 값 : " + num2);
		System.out.println("두 수를 더한 값 : " + sum);

		out.print("<html><head><title>응답결과</title></head>");
		out.print("<body>");
		out.print("<h1>두 수의 더하기 연산결과</h1>");
		out.print("값 : " + num1 + "+" + num2 + "=" + sum);
		out.print("</body></html>");
	}
}
