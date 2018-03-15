package org.saccoware.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.saccoware.model.ClientLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Qualifier("clientLoanDaoImpl")
public class ClientLoanDaoImpl implements ItemDao<ClientLoan> {
	private static final Logger log = LogManager.getLogger("org.saccoware.dao.ClientLoanDaoImpl");
	int result ;
	@Autowired SessionFactory factory;
	
	@Transactional
	public List<ClientLoan> getAllItems() throws DataAccessException {
		return factory.getCurrentSession()
				.createQuery("FROM ClientLoan").list();
	}
	@Transactional
	public void addItem(ClientLoan fm) throws DataAccessException {
		factory.getCurrentSession().save(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void updateItem(ClientLoan fm) throws DataAccessException {
		factory.getCurrentSession().update(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public ClientLoan getItemById(int id) throws DataAccessException {
		return factory.getCurrentSession()
				.get(ClientLoan.class, id);
	}
	@Transactional
	public ClientLoan getItemByName(String itemName) throws DataAccessException {
		return (ClientLoan) factory.getCurrentSession().createQuery("SELECT FROM ClientLoan WHERE name = :item_name")
				.setParameter("item_name", itemName);
		
	}
	@Transactional
	public void removeItem(int id) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientLoan WHERE id = :item_id")
		.setParameter("item_id", id);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientLoan WHERE name = :item_name")
		.setParameter("item_name", Name);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void removeAllItems() throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientLoan");
		log.info("Rows affected: " + result);
	}

}
