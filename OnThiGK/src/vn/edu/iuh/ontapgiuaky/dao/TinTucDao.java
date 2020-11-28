package vn.edu.iuh.ontapgiuaky.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import vn.edu.iuh.ontapgiuaky.model.TinTuc;

public class TinTucDao {
	private EntityManager em;

	public TinTucDao() {
		// TODO Auto-generated constructor stub
		em = MyEntityManager.getInstance().getEntityManager();
	}

	public boolean addTinTuc(TinTuc tinTuc) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(tinTuc);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateTinTuc(TinTuc tinTuc) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(tinTuc);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public TinTuc getTinTucById(int id) {
		return em.find(TinTuc.class, id);
	}

	public List<TinTuc> getAllTinTuc() {
		return em.createNativeQuery("select * from tintuc").getResultList();
	}
}
