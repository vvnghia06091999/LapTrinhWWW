package vn.edu.iuh.ontapgiuaky.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.ontapgiuaky.dao.DanhMucDao;
import vn.edu.iuh.ontapgiuaky.model.DanhMuc;

/**
 * Servlet implementation class DanhSachTinTucServlet
 */
@WebServlet("/danhSachTinTuc")
public class DanhSachTinTucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DanhSachTinTucServlet() {
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
		DanhMucDao danhMucDao = new DanhMucDao();
		List<DanhMuc> dsDanhMuc = danhMucDao.getAllDanhMuc();
		request.setAttribute("dsDanhMuc", dsDanhMuc);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/danhSachTinTucView.jsp");
		dispatcher.forward(request, response);
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
