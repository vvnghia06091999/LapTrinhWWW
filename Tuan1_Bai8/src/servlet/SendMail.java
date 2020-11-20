package servlet;

import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendMail
 */
@WebServlet("/SendMail")
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendMail() {
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
		String m;
		String from = "vovannghiatestmail@gmail.com";
		String password = "ZZ123654987";
		String to = request.getParameter("mail");
		String mess = request.getParameter("message");

		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new javax.mail.internet.InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new javax.mail.internet.InternetAddress(to));
			message.setSubject("From " + from);
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(mess);
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			String filename = "file.txt";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);
			Transport.send(message);
			m = "Gửi thành công !";
		} catch (MessagingException e) {
			// TODO: handle exception
			m = "ERROR" + e.getMessage();
			e.printStackTrace();
		}
		request.setAttribute("Messager", m);
		getServletContext().getRequestDispatcher("/MessageServlet").forward(request, response);
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
