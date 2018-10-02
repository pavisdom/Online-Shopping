package online_shopping_store;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	if(User.isMailExist(request.getParameter("cemail"))||!(Validation.matchPassword(request.getParameter("cPassword"), request.getParameter("crPassword")))) {
		if(User.isMailExist(request.getParameter("cemail"))) {
			request.setAttribute("email","Entered Email are already exist" );
			
		}
		
		if(!(Validation.matchPassword(request.getParameter("cPassword"), request.getParameter("crPassword")))){
			request.setAttribute("pwd","Password didnt match" );
		}
		request.getRequestDispatcher("/SignUp.jsp").forward(request, response);
	}else {
		
		User newUser = User.createNew();
		newUser.setCname(request.getParameter("cName"));
		newUser.setcAddress(request.getParameter("cAddress"));
		newUser.setEmail(request.getParameter("cemail"));
		newUser.setCpwd(request.getParameter("cPassword"));
		newUser.setCiurl(request.getParameter("ciURL"));
		newUser.updateDB();

		request.getRequestDispatcher("/HomePage.jsp").forward(request, response);

		} 
	}

}
