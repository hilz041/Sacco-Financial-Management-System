package org.saccoware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

	@RequestMapping(value="/biodata",method=RequestMethod.GET)
public String biodataPage() {
	return "clientBioData";
	}

	@RequestMapping(value="/loan",method=RequestMethod.GET)
	public String clientLoanPage() {
		return "ClientLoan";
		}
	
	@RequestMapping(value="/enterSavings",method=RequestMethod.GET)
	public String clientListPage() {
		return "ClientSavingsForm";
		}
	
	@RequestMapping(value="/accounts",method=RequestMethod.GET)
	public String saccoAccountsPage() {
		return "SaccoAccounts";
		}
	
	@RequestMapping(value="/biodatalist",method=RequestMethod.GET)
	public String biodataListPage() {
		return "ClientList";
		}
	
	@RequestMapping(value="/savingslist",method=RequestMethod.GET)
	public String savingsListPage() {
		return "ClientSavingsList";
		}

}
