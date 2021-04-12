package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Policy;
import com.cg.services.AdminServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminSer;
	
	@PostMapping("/addPolicy")
	public void addPolicy(@RequestBody Policy p) {
		adminSer.addPolicy(p);
	}
	
	@GetMapping("/getAllPolicy")
	public List<Policy> getAllPolicy(){
		return adminSer.getAllPolicy();
	}
}
