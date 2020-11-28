package vn.edu.iuh.ontapgiuaky.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import vn.edu.iuh.ontapgiuaky.model.DanhMuc;

public class DanhMucDao {
	private EntityManager em;

	public DanhMucDao() {
		// TODO Auto-generated constructor stub
		em = MyEntityManager.getInstance().getEntityManager();
	}

	public boolean addDanhMuc(DanhMuc danhMuc) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(danhMuc);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateDanhMuc(DanhMuc danhMuc) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(danhMuc);
			tr.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public DanhMuc getDanhMucById(int id) {
		return em.find(DanhMuc.class, id);
	}

	public List<DanhMuc> getAllDanhMuc() {
		return em.createNativeQuery("select * from danhmuc", DanhMuc.class).getResultList();
	}
	public DanhMuc getDanhMucByName(String name) {
		return (DanhMuc) em.createNativeQuery("select * from danhmuc where tenDanhMuc like '"+name+"'",DanhMuc.class).getResultList().get(0);
	}

}
