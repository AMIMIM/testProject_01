package com.adrian.project01.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EloController {

	@RequestMapping("/elo")
	public String helloMethod(@RequestParam(value="name", required=false, defaultValue="there mate!") String name, Model model) {
		model.addAttribute("name", name);
		return "Index";
	}
	
}
