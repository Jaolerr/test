package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.inti.repo.EntrepriseRepo;

@Controller
public class EntrepriseController {
	
	@Autowired EntrepriseRepo ier;
	

}
