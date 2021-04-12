package com.cg.services;

import java.util.List;

import com.cg.entities.Policy;

public interface AdminService {

	public void addPolicy(Policy p);
	
	public List<Policy> getAllPolicy();
}
