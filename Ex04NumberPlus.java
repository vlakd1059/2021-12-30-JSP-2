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
		// ���ڿ� -> ������ȯ : Integer.parseInt()
		String num1 = request.getParameter("num1");
		int i = Integer.parseInt(num1);
		String num2 = request.getParameter("num2");
		int j = Integer.parseInt(num2);

		// int num1 = Integer.parseInt(request.getParameter("num1"));
		// int num2 = Integer.parseInt(request.getParameter("num2"));

		sum = i + j;

		System.out.println("ù ��° ���޹��� �� : " + num1);
		System.out.println("�� ��° ���޹��� �� : " + num2);
		System.out.println("�� ���� ���� �� : " + sum);

		out.print("<html><head><title>������</title></head>");
		out.print("<body>");
		out.print("<h1>�� ���� ���ϱ� ������</h1>");
		out.print("�� : " + num1 + "+" + num2 + "=" + sum);
		out.print("</body></html>");
	}
}
