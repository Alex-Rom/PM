package ro.jademy.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.jademy.domain.Factory;

@WebServlet("/Reset")
public class ResetareParolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codReset = request.getParameter("codReset");
		String email = request.getParameter("email");
		String newPass = request.getParameter("parolaNoua");
		if (codReset == Factory.user.getCod_reset_pass()&& email==Factory.user.getEmail()) {

			Factory.daoImpl.resetPass(newPass, codReset, email);

			request.setAttribute("ok", "Ai reusit!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/resetareParola.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("not_ok", "Ai esuat!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/resetareParola.jsp");
			dispatcher.forward(request, response);
		}

	}
}
