package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.MemberVo;

/**
 * Servlet implementation class _07Servlet
 */
@WebServlet("/07")
public class _07Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public _07Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberVo vo1 = new MemberVo();
		vo1.setName( "안대혁1" );
		vo1.setEmail( "kickscar1@gmail.com" );
		
		HttpSession session = request.getSession( true );
		session.setAttribute( "user", vo1 );
	
		MemberVo vo2 = new MemberVo();
		vo2.setName( "안대혁2" );
		vo2.setEmail( "kickscar2@gmail.com" );
		request.setAttribute( "user", vo2 );
		
		request.getRequestDispatcher( "/view/07.jsp" ).forward( request, response );
	}
}
