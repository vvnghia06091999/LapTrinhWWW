package vn.eu.iuh.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import vn.eu.iuh.entity.Product;

public class ProductDao {
	private EntityManager em;

	public ProductDao() {
		// TODO Auto-generated constructor stub
		em = MyEntityManager.getInstance().getEntityManager();
		//initProduct();
	}

	public void addProduct(Product product) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(product);
			tr.commit();
		} catch (RuntimeException e) {
			tr.rollback();
			throw e;
		}
	}

	private Product getProductByID(int id) {
		return em.find(Product.class, id);
	}

	public List<Product> getAllProduct() {
		return em.createNativeQuery("Select * from Product", Product.class).getResultList();
	}

	private void initProduct() {
		Product sp = new Product("Nokia Lumia","abcd",10,5555,"/images/dt1.jpg");
		addProduct(sp);
		
		sp = new Product("Samsung Galaxy S7","dsads",40,6546,"/images/dt2.jpg");
		addProduct(sp);
		
		sp = new Product("Oppo neo7","dsaeqq",10,143252,"/images/dt3.jpg");
		addProduct(sp);

		sp = new Product("Iphone X","dsaeqq",10,143252,"/images/dt4.jpg");
		addProduct(sp);
		
		sp = new Product("HUAWEI P9","dsaeqq",10,143252,"/images/dt5.jpg");
		addProduct(sp);

		sp = new Product("Nokia 1280","dsaeqq",10,143252,"/images/dt6.jpg");
		addProduct(sp);
		
		sp = new Product("Sony XZ","dsaeqq",10,143252,"/images/dt7.jpg");
		addProduct(sp);
	}
}
