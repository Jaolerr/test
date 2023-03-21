package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.inti.model.Salarie;
import com.inti.repo.SalarieRepo;

@Controller
public class SalarieController {
	@Autowired
	SalarieRepo isr;
	
	
	@GetMapping("inscription")
	public String inscr() {
		System.out.println(new Salarie("test", "test", "test"));
		
		return "inscription";
		
	}
	//comm
	@PostMapping("inscription")
	public String inscription(@ModelAttribute("salarie") Salarie s) {
		
		isr.save(s);
		return "inscription";
	}
	

}
