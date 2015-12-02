package ro.jademy.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ro.jademy.domain.Factory;
import ro.jademy.domain.User;

@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = null;
		
		user = Factory.daoImpl.getUser(email, password);
		
		if (user != null){

			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/upload.jsp");
			dispatcher.forward(request, response);
			
		} else {
			
			request.setAttribute("invalid", "Email sau parola gresite.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}

}









