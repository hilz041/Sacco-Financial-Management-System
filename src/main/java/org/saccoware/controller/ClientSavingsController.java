package org.saccoware.controller;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.model.ClientBioData;
import org.saccoware.model.ClientSavings;
import org.saccoware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientSavingsController {
	private static final Logger log = LogManager.getLogger("org.saccoware.controller.ClientSavingsController");
	@Autowired(required=false)
	@Qualifier(value="clientSavingsServiceImpl")
	private ItemService<ClientSavings> itmserv;
	public ItemService<ClientSavings> getItmserv() {
		return itmserv;
	}
	public void setItmserv(ItemService<ClientSavings> itmserv) {
		this.itmserv = itmserv;
	}
	
	//populate map with client details and return Savings List page
	@RequestMapping(value="/clientSavingsLink", method = RequestMethod.GET)
	public String gotoSavingList(Map<String, Object>map) {
		return "ClientSavingsForm";
		}	
	
	//deposit money
		@RequestMapping(value="/savings_deposit_form", method = RequestMethod.POST)
		public String deposit(@ModelAttribute("savings") ClientSavings savings,BindingResult bind,
				Map<String, Object>map) {
				itmserv.addItem(savings);
			
				map.put("savings", savings);
				map.put("savingsList", itmserv.getAllItems());
				
			return "ClientSavingsList";
			}	
		
		//withdraw money
				@RequestMapping(value="/savings_withdraw_form", method = RequestMethod.GET)
				public String withdraw(@ModelAttribute("savings") ClientSavings savings,BindingResult bind,
						Map<String, Object>map) {
				
					itmserv.addItem(savings);
					map.put("savings", savings);
					map.put("savingsList", itmserv.getAllItems());
					
					return "ClientSavingsList";
					}	
				
			
	

	}//close controller