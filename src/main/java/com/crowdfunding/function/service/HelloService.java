package com.crowdfunding.function.service;

import java.util.List;

import com.crowdfunding.function.entity.HelloEntity;

public interface HelloService {
	public List<HelloEntity> getHelloEntity();
	public String getMassage();
}
