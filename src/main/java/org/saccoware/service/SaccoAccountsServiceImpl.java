package org.saccoware.service;

import java.util.Calendar;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.dao.ItemDao;
import org.saccoware.model.SaccoAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Qualifier("saccoAccountsServiceImpl")
public class SaccoAccountsServiceImpl implements ItemService<SaccoAccounts> {
	private static final Logger log = LogManager.getLogger("org.saccoware.service.SaccoAccountsServiceImpl");
	@Autowired(required=true)
	@Qualifier(value="saccoAccountsDaoImpl")
	public ItemDao<SaccoAccounts> sacdao ;
	public SaccoAccountsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	 Calendar cal =Calendar.getInstance();
	@Transactional
	public List<SaccoAccounts> getAllItems() throws DataAccessException {
		
		return sacdao.getAllItems();
	}

	@Transactional
	public void addItem(SaccoAccounts fm) throws DataAccessException {
		sacdao.addItem(fm);
		
	}

	@Transactional
	public void updateItem(SaccoAccounts fm) throws DataAccessException {
		sacdao.updateItem(fm);
		
	}

	@Transactional
	public SaccoAccounts getItemById(int id) throws DataAccessException {
		return sacdao.getItemById(id);
	}

	@Transactional
	public SaccoAccounts getItemByName(String itemName) throws DataAccessException {
		return sacdao.getItemByName(itemName);
	}

	@Transactional
	public void removeItem(int id) throws DataAccessException {
		sacdao.removeItem(id);
		
	}

	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		sacdao.removeItemByName(Name);
		
	}

	@Transactional
	public void removeAllItems() throws DataAccessException {
		sacdao.removeAllItems();
	}

}
