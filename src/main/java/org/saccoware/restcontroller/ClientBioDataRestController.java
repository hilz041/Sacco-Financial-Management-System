package org.saccoware.restcontroller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.model.ClientBioData;
import org.saccoware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientBioDataRestController {
	private static final Logger log = LogManager.getLogger("org.saccoware.restcontroller.ClientBioDataRestController");
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String getAll() {
		return "God Bless You";}
	
	@Autowired(required=true)
	@Qualifier(value="clientBioDataServiceImpl")
	public ItemService<ClientBioData>  dbdao ;
	
	@RequestMapping(value="/all", method= RequestMethod.GET)
	//@Produces(MediaType.APPLICATION_XML)
	public List<ClientBioData> getAllItems() throws DataAccessException {
		return dbdao.getAllItems();
	} 
	
	@RequestMapping(value="/addItem", method= RequestMethod.POST)
	public void addItem(ClientBioData fm) throws DataAccessException {
		dbdao.addItem(fm);
		
	}
}
