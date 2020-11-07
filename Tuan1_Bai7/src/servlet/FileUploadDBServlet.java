package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/**
 * Servlet implementation class FileUploadDBServlet
 */
@WebServlet("/FileUploadDBServlet")
@MultipartConfig(maxFileSize = 16177215)
public class FileUploadDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFFER_SIZE = 4096;
	private static final String SAVE_DIR = "images";
	private String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=UploadFileServletDB";
	private String dbUser = "sa";
	private String dbPass = "sapassword";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FileUploadDBServlet() {
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
		String FirstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		InputStream inputStream = null;

		Part filePart = request.getPart("photo");
		String fileUploadName = "";
		if (filePart != null) {
			fileUploadName = filePart.getName();
			inputStream = filePart.getInputStream();
		}

		Connection con = null;
		String message = null;

		String filePath = "D:/" + fileUploadName + ".jpg";
		try {
			DriverManager.registerDriver(new SQLServerDriver());
			con = DriverManager.getConnection(dbURL, dbUser, dbPass);
			String sql = "INSERT INTO contacts (first_name, last_name, photo) values(?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, FirstName);
			statement.setString(2, LastName);

			if (inputStream != null) {
				statement.setBlob(3, inputStream);
			}
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "File uploaded and saved into database";
			}
			String sql1 = "SELECT photo FROM contacts WHERE first_name=? AND last_name=?";
			statement = con.prepareStatement(sql1);
			statement.setString(1, FirstName);
			statement.setString(2, LastName);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				Blob blod = result.getBlob("photo");
				inputStream = blod.getBinaryStream();
				OutputStream outputStream = new FileOutputStream(filePath);
				int bytesRead = -1;
				byte[] buffer = new byte[BUFFER_SIZE];
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
				inputStream.close();
				outputStream.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			message = "ERROR" + e.getMessage();
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}

		request.setAttribute("Messager", message);
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
