package vn.eu.iuh.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MyEntityManager {
	private static MyEntityManager instance = null;

	private EntityManager entityManager;

	private MyEntityManager() {
		entityManager = Persistence.createEntityManagerFactory("Tuan3_4_Bai4").createEntityManager();

	}

	public synchronized static MyEntityManager getInstance() {
		if (instance == null) {
			instance = new MyEntityManager();
		}
		return instance;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
