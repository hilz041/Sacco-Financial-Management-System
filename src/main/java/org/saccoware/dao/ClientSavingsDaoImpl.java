package org.saccoware.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.saccoware.model.ClientSavings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Qualifier("clientSavingsDaoImpl")
public class ClientSavingsDaoImpl implements ItemDao<ClientSavings> {
	private static final Logger log = LogManager.getLogger("org.saccoware.dao.ClientSavingsDaoImpl");
	int result ;
	public ClientSavingsDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired SessionFactory factory;
	
	@Transactional
	public List<ClientSavings> getAllItems() throws DataAccessException {
		return factory.getCurrentSession()
				.createQuery("FROM ClientSavings").list();
	}
	@Transactional
	public void addItem(ClientSavings fm) throws DataAccessException {
		factory.getCurrentSession().save(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public void updateItem(ClientSavings fm) throws DataAccessException {
		factory.getCurrentSession().update(fm);
		log.info("Rows affected: " + result);
		
	}
	@Transactional
	public ClientSavings getItemById(int id) throws DataAccessException {
		return factory.getCurrentSession()
				.get(ClientSavings.class, id);
	}
	@Transactional
	public ClientSavings getItemByName(String itemName) throws DataAccessException {
		return (ClientSavings) factory.getCurrentSession().createQuery("SELECT FROM ClientSavings WHERE name = :item_name")
				.setParameter("item_name", itemName);
	}
	@Transactional
	public void removeItem(int id) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientSavings WHERE id = :item_id")
		.setParameter("item_id", id);
		log.info("Rows affected: " + result);
	}
	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientSavings WHERE name = :item_name")
		.setParameter("item_name", Name);
		log.info("Rows affected: " + result);
		
		
	}
	@Transactional
	public void removeAllItems() throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientSavings");
		log.info("Rows affected: " + result);
		
	}

}
