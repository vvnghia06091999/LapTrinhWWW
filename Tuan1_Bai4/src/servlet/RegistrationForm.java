package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String name = firstName + " " + lastName;
			String email = request.getParameter("email");
			String facebook = request.getParameter("facebook");
			String shortbio = request.getParameter("shortBio");

			String html = "<br>" + "<html>" + "<head>" + "<title>Result Page</title>" + "</head>" + "<body>" + "Name : "
					+ name + "<br/>" + "Email : " + email + "<br/>";
			if (facebook.equalsIgnoreCase("")) {
				html += "Facebooke URL: none! <br/>";
			} else {
				html += "Facebooke URL: " + facebook + "<br/>";
			}

			if (shortbio.equalsIgnoreCase("")) {
				html += "Short Bio : none! <br/>";
			} else {
				html += "Short Bio : " + shortbio + "<br/>";
			}
			html += "</body>" + "</html>";
			out.print(html);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
