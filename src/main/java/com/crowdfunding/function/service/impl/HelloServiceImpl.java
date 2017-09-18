package com.crowdfunding.function.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crowdfunding.function.dao.HelloDAO;
import com.crowdfunding.function.entity.HelloEntity;
import com.crowdfunding.function.service.HelloService;

@Service
@Transactional
public class HelloServiceImpl implements HelloService{
	@Autowired
	HelloDAO helloDAO;
	
	@Override
	public List getHelloEntity() {
		List<HelloEntity> helloEntities = helloDAO.findAll();
		for(HelloEntity entry: helloEntities) {
			System.out.println(entry.getName());
		}
		return helloEntities;
	}

	@Override
	public String getMassage() {
		String result = helloDAO.getMessage("test");
		return result;
	}
	
}
