package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/limpar.do")
public class LimparAtt extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("flu1", null); // Setando no escopo de requisi��o
		request.getSession().setAttribute("flu2", null); // Setando no escopo de sess�o.
		getServletContext().setAttribute("flu3", null); // Setando no escopo de aplica��o.
		RequestDispatcher view = request.getRequestDispatcher("listaAtributos.jsp");
		view.forward(request, response);
	}

}