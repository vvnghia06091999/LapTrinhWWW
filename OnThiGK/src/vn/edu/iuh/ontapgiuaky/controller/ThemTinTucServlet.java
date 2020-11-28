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
import vn.edu.iuh.ontapgiuaky.dao.TinTucDao;
import vn.edu.iuh.ontapgiuaky.model.DanhMuc;
import vn.edu.iuh.ontapgiuaky.model.TinTuc;

/**
 * Servlet implementation class ThemTinTucServlet
 */
@WebServlet("/themTinTuc")
public class ThemTinTucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemTinTucServlet() {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/themTinTucView.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String tieuDe = request.getParameter("tieuDe");
		String noiDungTT = request.getParameter("noiDungTT");
		String lienKet = request.getParameter("lienKet");
		String tenDanhMuc = request.getParameter("tenDanhMuc");
		TinTuc tinTuc = new TinTuc();
		tinTuc.setTieuDe(tieuDe);
		tinTuc.setNoiDungTT(noiDungTT);
		tinTuc.setLienKet(lienKet);
		DanhMucDao danhMucDao = new DanhMucDao();
		DanhMuc danhMuc = danhMucDao.getDanhMucByName(tenDanhMuc);
		tinTuc.setDanhMuc(danhMuc);
		TinTucDao tinTucDao = new TinTucDao();
		tinTucDao.addTinTuc(tinTuc);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/danhSachTinTuc");
		dispatcher.forward(request, response);
	}

}
