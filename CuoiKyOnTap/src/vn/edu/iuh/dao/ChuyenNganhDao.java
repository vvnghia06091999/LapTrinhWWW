package vn.edu.iuh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.entities.ChuyenNganh;

@Repository
public class ChuyenNganhDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<ChuyenNganh> getAllChuyenNganh() {
		Session session = this.sessionFactory.getCurrentSession();

		//String sql = "from ChuyenNganh";

		//Query query = session.createQuery(sql);

		return session.createNativeQuery("Select * from ChuyenNganh",ChuyenNganh.class).getResultList();
	}

}
