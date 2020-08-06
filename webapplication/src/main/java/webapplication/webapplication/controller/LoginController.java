package webapplication.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginmessage(ModelMap model) {
//		model.put("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String WelcomePage(ModelMap model, @RequestParam String name) {
		model.put("name", name);
		return "welcome";
	}
}
