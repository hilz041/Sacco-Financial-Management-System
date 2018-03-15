package org.saccoware.service;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.dao.ItemDao;
import org.saccoware.model.ClientBioData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Qualifier("clientBioDataServiceImpl")
public class ClientBioDataServiceImpl implements ItemService<ClientBioData> {
	private static final Logger log = LogManager.getLogger("org.saccoware.service.ClientBioDataServiceImpl");
	public ClientBioDataServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired(required=true)
	@Qualifier(value="clientBioDataDaoImpl")
	public ItemDao<ClientBioData>  dbdao ;
	@Transactional
	public List<ClientBioData> getAllItems() throws DataAccessException {
		return dbdao.getAllItems();
	}

	@Transactional
	public void addItem(ClientBioData fm) throws DataAccessException {
		dbdao.addItem(fm);
		
	}

	@Transactional
	public void updateItem(ClientBioData fm) throws DataAccessException {
		dbdao.updateItem(fm);
		
	}

	@Transactional
	public ClientBioData getItemById(int id) throws DataAccessException {
		return dbdao.getItemById(id);
	}

	@Transactional
	public ClientBioData getItemByName(String itemName) throws DataAccessException {
		return (ClientBioData) dbdao.getItemByName(itemName);
	}

	@Transactional
	public void removeItem(int id) throws DataAccessException {
		dbdao.removeItem(id);
		
	}

	@Transactional
	public void removeItemByName(String Name) throws DataAccessException {
		dbdao.removeItemByName(Name);
		
	}

	@Transactional
	public void removeAllItems() throws DataAccessException {
		dbdao.removeAllItems();
		
	}

}
