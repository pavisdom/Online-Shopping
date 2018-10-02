package online_shopping_store;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("pwd",request.getParameter("pwd") );
		//request.getRequestDispatcher("/Login.jsp").forward(request, response);
		if(Login.validatePwd(request.getParameter("email"), request.getParameter("pwd"))) {
			request.setAttribute("userlog", User.currentUser.getCname());
			request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
		}else {
			request.setAttribute("loginErr", "The Email or Password is incorrect");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
		

	}

}
