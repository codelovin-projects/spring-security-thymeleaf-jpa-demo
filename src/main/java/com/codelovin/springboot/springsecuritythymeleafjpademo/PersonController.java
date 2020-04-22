package com.codelovin.springboot.springsecuritythymeleafjpademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping("/api/persons")
	public String getPersons(Model model) {
	    List<Person> listPersons = personService.retrievePersons();
	    model.addAttribute("listPersons", listPersons);
	    return "hello";
	}
}

