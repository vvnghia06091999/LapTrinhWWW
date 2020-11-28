package vn.edu.iuh.ontapgiuaky.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MyEntityManager {
	private EntityManager em;
	private static MyEntityManager instance = null;

	public MyEntityManager() {
		// TODO Auto-generated constructor stub
		em = Persistence.createEntityManagerFactory("OnThiGK").createEntityManager();
	}

	public synchronized static MyEntityManager getInstance() {
		if (instance == null) {
			instance = new MyEntityManager();
		}
		return instance;
	}

	public EntityManager getEntityManager() {
		return em;
	}

}
