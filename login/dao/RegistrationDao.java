package com.xworkz.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.login.Entity.UserEntity;

@Repository
public class RegistrationDao {
	/*
	 * public void savePlacementEntity(PlacementEntity entity) { Transaction
	 * transaction = null; try (Session session =
	 * PlacementUtil.getSessionFactory().openSession()) {
	 * 
	 * transaction = session.beginTransaction();
	 * 
	 * session.save(entity);
	 * 
	 * transaction.commit(); } catch (Exception e) { if (transaction != null) {
	 * transaction.rollback(); } e.printStackTrace(); } }
	 * 
	 * public boolean validate(String userName, String password) {
	 * 
	 * Transaction transaction = null; Entity entity = null; try (Session session =
	 * PlacementUtil.getSessionFactory().openSession()) {
	 * 
	 * transaction = session.beginTransaction();
	 * 
	 * entity = (Entity)
	 * session.createQuery("FROM Entity U WHERE U.username = :userName")
	 * .setParameter("userName", userName).uniqueResult();
	 * 
	 * if (entity != null && entity.getPassword().equals(password)) { return true; }
	 * 
	 * transaction.commit(); } catch (Exception e) { if (transaction != null) {
	 * transaction.rollback(); } e.printStackTrace(); } return false; }
	 * 
	 * }
	 */

	@Autowired
	EntityManagerFactory entityManagerFactory;
	private final Logger logger = LogManager.getLogger(RegistrationDao.class);

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;

	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void saveData(UserEntity entity) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		logger.info("INFO-save method of registrationdao ");
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}
