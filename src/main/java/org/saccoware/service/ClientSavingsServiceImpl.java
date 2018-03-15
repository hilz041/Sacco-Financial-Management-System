package org.saccoware.service;

import java.util.List; 


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.dao.ItemDao;
import org.saccoware.model.ClientSavings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Qualifier("clientSavingsServiceImpl")
public class ClientSavingsServiceImpl implements ItemService<ClientSavings> {
	private static final Logger log = LogManager.getLogger("org.saccoware.service.ClientSavingsServiceImpl");
	public ClientSavingsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired(required=true)
	@Qualifier(value="clientSavingsDaoImpl")
	public ItemDao<ClientSavings> sasv ;
	@Transactional
	public List<ClientSavings> getAllItems() throws DataAccessException {
		// TODO Auto-generated method stub
		return sasv.getAllItems();
	}

	@Transactional
	public void addItem(ClientSavings fm) throws DataAccessException {
		sasv.addItem(fm);
		
	}

	@Transactional
	public void updateItem(ClientSavings fm) throws DataAccessException {
		sasv.updateItem(fm);
	}

	@Transactional
	public ClientSavings getItemById(int id) throws DataAccessException {
		return sasv.getItemById(id);
	}

	@Transactional
	public ClientSavings getItemByName(String itemName) throws DataAccessException {
		return sasv.getItemByName(itemName);
	}

	@Transactional
	public void removeItem(int id) throws DataAccessException {
		sasv.removeItem(id);
		
	}

	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		sasv.removeItemByName(Name);
		
	}

	@Transactional
	public void removeAllItems() throws DataAccessException {
		sasv.removeAllItems();
		
	}

}
