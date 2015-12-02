package ro.jademy.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.jademy.domain.Factory;
import ro.jademy.domain.User;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String prenume = request.getParameter("prenume");
		String nume = request.getParameter("nume");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String telefon = request.getParameter("telefon");

		if (!("".equals(prenume.trim())||"".equals(nume.trim())|| "".equals(email.trim())
				|| "".equals(password.trim()) || "".equals(telefon.trim()))) {
			User user = new User(prenume, nume, email, password, telefon, null);

			boolean bool = Factory.daoImpl.addUser(user);

			if (bool) {
				request.setAttribute("mesaj_ok", "Contul a fost introdus in sistem. "
						+ "<a href='index.jsp'> Click pentru a te loga </a>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/SignUpForm.jsp");
				dispatcher.forward(request, response);
			} else {
				// nu s-a facut adaugarea in baza de date pentru ca:
				// 1. serverul de mysql e down
				// 2. avem email sau username duplicat 
				request.setAttribute("mesaj_not_ok", "Contul nu a fost introdus in sistem. Posibil duplicat email sau username sau serverul de mysql nu functioneaza.");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/SignUpForm.jsp");
				dispatcher.forward(request, response);
			}
		} else {
			request.setAttribute("mesaj_not_ok", "Unul dintre campuri este gol.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/SignUpForm.jsp");
			dispatcher.forward(request, response);
		}
	}
}








