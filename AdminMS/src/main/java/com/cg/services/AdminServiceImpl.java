package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AdminDao;
import com.cg.entities.Policy;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	
	@Override
	public void addPolicy(Policy p) {
		adminDao.saveAndFlush(p);
		System.out.println("Policy Added");
	}

	@Override
	public List<Policy> getAllPolicy() {
		List<Policy> list = adminDao.findAll();
		return list;
	}

}
