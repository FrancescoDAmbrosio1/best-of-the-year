package org.lessons.bestyear.controller;

import org.lessons.bestyear.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/users")
	public String bestYear(Model model) {
		
		Utente user1 = new Utente();
		user1.setName("Francesco");
		
		model.addAttribute("user", user1.getName());
		
		return "utenti";
	}
}
