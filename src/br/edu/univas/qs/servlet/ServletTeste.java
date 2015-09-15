package br.edu.univas.qs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.univas.qs.util.JpaUtil;

@WebServlet("/teste")
public class ServletTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletTeste() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JpaUtil.getEntityManager();
		PrintWriter out = response.getWriter();
		String out1 = "<h1 style=\"color:yellow;background-color:green;text-align:center\">Funfou!!!</h1>";

		out.println(out1);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
