package org.saccoware.controller;

import java.io.IOException;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.model.ClientBioData;
import org.saccoware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientBioDataController {
	private static final Logger log = LogManager.getLogger("org.saccoware.controller.ClientBioDataController");
	@Autowired(required=true)
	@Qualifier(value="clientBioDataServiceImpl")
	private ItemService<ClientBioData> itmserv;
	public void setItmserv(ItemService<ClientBioData> itmserv) {
		this.itmserv = itmserv;
	}
	
	public ClientBioDataController(ItemService<ClientBioData> itmserv) {
		this.itmserv = itmserv;
	}
	public ClientBioDataController() {
	
	}
	//CRUD Methods
	 @RequestMapping(value = "/client_bio_data")
	    public ModelAndView listClient(ModelAndView model) throws IOException {
		 ClientBioData clientbiodata = new ClientBioData();
		 model.addObject("clientbiodata", clientbiodata);
		 model.addObject("clientbiodataList", itmserv.getAllItems());
	        model.setViewName("ClientList");
	        return model;
	    }
	 //redirect back to Bio-data Entry form
	 @RequestMapping(value = "/saveClientlink", method = RequestMethod.GET)
	    public ModelAndView newClient(ModelAndView model) {
		 ClientBioData client = new ClientBioData();
	        model.addObject("client", client);
	        model.setViewName("clientBioData");
	        return model;
	    }
	
	 @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
	    public ModelAndView saveEmployee(@ModelAttribute ClientBioData client) {
	        if (client.getId() == 0) { // if employee id is 0 then creating the
	            // employee other updating the employee
	        	itmserv.addItem(client);
	        } else {
	        	itmserv.updateItem(client);
	        }
	        return new ModelAndView("redirect:/");
	    }
	 
	 
	 @RequestMapping(value = "/deleteClientById", method = RequestMethod.DELETE)
	    public ModelAndView deleteClientById(HttpServletRequest request) {
	        int clientId = Integer.parseInt(request.getParameter("id"));
	        ClientBioData client = itmserv.getItemById(clientId);
	        itmserv.removeItem(clientId);
	        return new ModelAndView("redirect:/").addObject("client", client );
	    }
	 
	 @RequestMapping(value = "/editClientById", method = RequestMethod.PUT)
	    public ModelAndView editClientById(HttpServletRequest request) {
	        int clientId = Integer.parseInt(request.getParameter("id"));
	        ClientBioData client = itmserv.getItemById(clientId);
	        ModelAndView model = new ModelAndView("clientBioData");
	        model.addObject("client", client);
	 
	        return model;
	    }
	
}//close controller
