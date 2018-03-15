package org.saccoware.service;

import java.util.List;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.dao.ItemDao;
import org.saccoware.model.ClientLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Qualifier("clientLoanServiceImpl")
public class ClientLoanServiceImpl implements ItemService<ClientLoan> {
	private static final Logger log = LogManager.getLogger("org.saccoware.service.ClientLoanServiceImpl");
	public ClientLoanServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired(required=true)
	@Qualifier(value="clientLoanDaoImpl")
	public ItemDao<ClientLoan> ldao ;
	@Override
	public List<ClientLoan> getAllItems() throws DataAccessException {
		// TODO Auto-generated method stub
		return ldao.getAllItems();
	}

	@Transactional
	public void addItem(ClientLoan fm) throws DataAccessException {
		ldao.addItem(fm);
		
	}

	@Transactional
	public void updateItem(ClientLoan fm) throws DataAccessException {
		ldao.updateItem(fm);
		
	}

	@Transactional
	public ClientLoan getItemById(int id) throws DataAccessException {
		return ldao.getItemById(id);
	}

	@Transactional
	public ClientLoan getItemByName(String itemName) throws DataAccessException {
		return ldao.getItemByName(itemName);
	}

	@Transactional
	public void removeItem(int id) throws DataAccessException {
		ldao.removeItem(id);
		
	}

	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		ldao.removeItemByName(Name);
		
	}

	@Transactional
	public void removeAllItems() throws DataAccessException {
		ldao.removeAllItems();
		
	}

}
