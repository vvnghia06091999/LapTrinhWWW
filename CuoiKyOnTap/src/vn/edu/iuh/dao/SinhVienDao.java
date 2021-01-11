package vn.edu.iuh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.entities.SinhVien;

@Repository
public class SinhVienDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void themSV(SinhVien sinhVien) {
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(sinhVien);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
