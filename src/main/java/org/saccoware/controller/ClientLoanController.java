package org.saccoware.controller;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.model.ClientBioData;
import org.saccoware.model.ClientLoan;
import org.saccoware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientLoanController {
	private static final Logger log = LogManager.getLogger("org.saccoware.controller.ClientLoanController");
	
		@Autowired(required=false)
		@Qualifier(value="clientLoanServiceImpl")
		private ItemService<ClientBioData> itmserv;

		public void setItmserv(ItemService<ClientBioData> itmserv) {
			this.itmserv = itmserv;
		}
//automatically display all loan client info
		@RequestMapping(value="/client_loan",method=RequestMethod.POST)
		public String saveData(Map<String, Object>map) {
			ClientLoan cloan = new ClientLoan();
			map.put("cloan", cloan);
			map.put("loanlist", itmserv.getAllItems());
			return "LoanList";
			}
		
		 //redirect back to client info entry form Entry form
		 @RequestMapping(value = "/saveClientloanLink", method = RequestMethod.GET)
		    public String newClient() {
		        return "LoanList";
		    }

}
