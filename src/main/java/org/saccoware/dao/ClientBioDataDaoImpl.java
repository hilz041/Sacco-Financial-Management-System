package org.saccoware.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.saccoware.model.ClientBioData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Qualifier("clientBioDataDaoImpl")
public class ClientBioDataDaoImpl implements ItemDao<ClientBioData> {
	private static final Logger log = LogManager.getLogger("org.saccoware.dao.ClientBioDataDaoImpl");
	int result ;
	
	@Autowired 
	SessionFactory factory;
	public ClientBioDataDaoImpl() {}

	@Transactional
	public List<ClientBioData> getAllItems() throws DataAccessException {
		log.info("");
		return factory.getCurrentSession()
				.createQuery("FROM ClientBioData").list();
	}

	@Transactional
	public void addItem(ClientBioData fm) throws DataAccessException {
		factory.getCurrentSession().save(fm);
		log.info("Rows affected: " + result);
	}

	@Transactional
	public void updateItem(ClientBioData fm) throws DataAccessException {
		factory.getCurrentSession().update(fm);
		log.info("Rows affected: " + result);
	}

	@Transactional
	public ClientBioData getItemById(int id) throws DataAccessException {
		return factory.getCurrentSession()
				.get(ClientBioData.class, id);
	}

	@Transactional
	public ClientBioData getItemByName(String itemName) throws DataAccessException {
		return (ClientBioData) factory.getCurrentSession().createQuery("FROM ClientBioData WHERE name = :item_name")
				.setParameter("item_name", itemName);
		
	}

	@Transactional
	public void removeItem(int id) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientBioData WHERE id = :item_id")
		.setParameter("item_id", id);
		log.info("Rows affected: " + result);
	}

	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientBioData WHERE name = :item_name")
		.setParameter("item_name", Name);
		log.info("Rows affected: " + result);
	}

	@Transactional
	public void removeAllItems() throws DataAccessException {
		factory.getCurrentSession().createQuery("DELETE FROM ClientBioData");
		log.info("Rows affected: " + result);
	}

}
