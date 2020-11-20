package vn.eu.iuh.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import vn.eu.iuh.dao.ProductDao;
import vn.eu.iuh.entity.Product;

public class TestConnection {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		List<Product> list = dao.getAllProduct();
		list.forEach(x ->{
			System.out.println(x.toString());
		});
	}
}
