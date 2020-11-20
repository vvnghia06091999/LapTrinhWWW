package vn.eu.iuh.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import vn.eu.iuh.entity.CartBeanItem;

public class CartBeanItemDao {
	private EntityManager em;

	public CartBeanItemDao() {
		// TODO Auto-generated constructor stub
		em = MyEntityManager.getInstance().getEntityManager();
	}

	public void addCartBeanItem(CartBeanItem beanItem) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(beanItem);
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			throw e;

		}
	}

	public void updateCartBeanItem(CartBeanItem beanItem) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(beanItem);
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			throw e;

		}
	}

	public void deleteCartBeanItem(int id) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(CartBeanItem.class, id));
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			throw e;

		}
	}

	public CartBeanItem getCartByID(int id) {
		return em.find(CartBeanItem.class, id);
	}

	public List<CartBeanItem> getAllCart() {
		return em.createNativeQuery("select * from CartBeanItem", CartBeanItem.class).getResultList();
	}

}
