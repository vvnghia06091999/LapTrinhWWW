package vn.eu.iuh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.eu.iuh.dao.CartBeanItemDao;
import vn.eu.iuh.entity.CartBeanItem;

/**
 * Servlet implementation class CartControllerServlet
 */
@WebServlet("/cartController")
public class CartControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double total = 0;
	private CartBeanItemDao beanItemDao = new CartBeanItemDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartControllerServlet() {
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
		// tresponse.getWriter().append("Served at: ").append(request.getContextPath());
		List<CartBeanItem> beanItems = beanItemDao.getAllCart();
		request.setAttribute("db", beanItems);
		beanItems.forEach(item -> {
			total = total + item.getDbTotalCost();
		});
		request.setAttribute("total", total);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/ShoppingCartView.jsp");
		dispatcher.forward(request, response);
		total = 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String action = request.getParameter("action");
		if (action != null || !action.equals("")) {
			if (action.equals("Add To Cart")) {
				addItem(request, response);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/modelList");
				dispatcher.forward(request, response);
			} else if (action.equals("Update")) {
				updateItem(request, response);
				doGet(request, response);
			} else if (action.equals("Delete")) {
				deleteItem(request, response);
				doGet(request, response);
			}
		}
	}

	private void deleteItem(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String stid = request.getParameter("id");
		int id = Integer.parseInt(stid);
		beanItemDao.deleteCartBeanItem(id);
	}

	private void updateItem(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String stid = request.getParameter("id");
		int id = Integer.parseInt(stid);
		String stiQuantity = request.getParameter("iQuantity");
		int iQuantity = Integer.parseInt(stiQuantity);
		CartBeanItem beanItem = beanItemDao.getCartByID(id);
		beanItem.setiQuantity(iQuantity);
		beanItem.setDbTotalCost(iQuantity * beanItem.getDbUnitCost());
		beanItemDao.updateCartBeanItem(beanItem);
	}

	private void addItem(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String strModelDescription = request.getParameter("description");
		String stdbUnitCost = request.getParameter("price");
		String stiQuantity = request.getParameter("quanlity");
		double dbUnitCost = Double.parseDouble(stdbUnitCost);
		int iQuantity = Integer.parseInt(stiQuantity);
		double dbTotalCost = dbUnitCost * iQuantity;

		CartBeanItem beanItem = new CartBeanItem(strModelDescription, dbUnitCost, iQuantity, dbTotalCost);
		beanItemDao.addCartBeanItem(beanItem);
	}

}
