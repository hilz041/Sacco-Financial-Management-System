package org.saccoware.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.saccoware.model.SaccoAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Qualifier("saccoAccountsDaoImpl")
public class SaccoAccountsDaoImpl implements ItemDao<SaccoAccounts> {
	private static final Logger log = LogManager.getLogger("org.saccoware.dao.SaccoAccountsDaoImpl");
	int result ;
	@Autowired SessionFactory factory;
	@Transactional
	public List<SaccoAccounts> getAllItems() throws DataAccessException {
		return factory.getCurrentSession()
				.createQuery("FROM ClientLoan").list();
	}
	@Transactional
	public void addItem(SaccoAccounts fm) throws DataAccessException {
		factory.getCurrentSession().save(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void updateItem(SaccoAccounts fm) throws DataAccessException {
		factory.getCurrentSession().update(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public SaccoAccounts getItemById(int id) throws DataAccessException {
		return factory.getCurrentSession()
				.get(SaccoAccounts.class, id);
	}
	@Transactional
	public SaccoAccounts getItemByName(String itemName) throws DataAccessException {
		return (SaccoAccounts) factory.getCurrentSession().createQuery("SELECT FROM SaccoAccounts WHERE name = :item_name")
				.setParameter("item_name", itemName);
	}
	@Transactional
	public void removeItem(int id) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM SaccoAccounts WHERE id = :item_id")
		.setParameter("item_id", id);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM SaccoAccounts WHERE name = :item_name")
		.setParameter("item_name", Name);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void removeAllItems() throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM SaccoAccounts");
		log.info("Rows affected: " + result);
	}

}
