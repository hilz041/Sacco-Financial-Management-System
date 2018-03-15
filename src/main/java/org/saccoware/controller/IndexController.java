package org.saccoware.controller;
import java.util.Map;

import org.saccoware.model.AdminLogin;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String welcome(){
	     return "index";
	  }
	 
	 @RequestMapping(value = "/securityDetails", method = RequestMethod.POST)
	  public String login(@ModelAttribute AdminLogin admn,BindingResult bindingResult,
	    		@RequestParam String action,Map<String,Object>map){ 
		return "Home";
	  
	  }

}
