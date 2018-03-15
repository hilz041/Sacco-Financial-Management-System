package org.saccoware.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.saccoware.model.ClientSavings;
import org.saccoware.model.SaccoAccounts;
import org.saccoware.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sacco_accounts")
public class SaccoAccountsController {
	private static final Logger log = LogManager.getLogger("org.saccoware.controller.SaccoAccountsController");
	@Autowired
	MessageSource messageSource;
	@Autowired(required=true)
	@Qualifier(value="saccoAccountsServiceImpl")
	private ItemService<SaccoAccounts> itmserv;
	public void setItmserv(ItemService<SaccoAccounts> itmserv) {
		this.itmserv = itmserv;
	}

}
