package com.adrian.project01.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.adrian.project01.entity.PersonForm;

@Controller
public class PersonController extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}
	
	@RequestMapping(value="/person", method=RequestMethod.GET)
	public String showForm(PersonForm personForm) {
		return "personForm";
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public String checkPersonInfo(@Valid PersonForm personForm,  Model model, BindingResult bindingResults) {
		
		if(bindingResults.hasErrors()) {
			return "personForm";
		}
		model.addAttribute("personOk", personForm);
		return "results";
	}
		
}
