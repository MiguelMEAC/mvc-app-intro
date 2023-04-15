package com.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class indexcontroller {

	@GetMapping({"/index","","/home","/"})
	public String index(Model model) {return "index";}
	
}
