package com.crowdfunding.function.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.crowdfunding.function.entity.HelloEntity;


public interface HelloDAO extends CrudRepository<HelloEntity, Long> {
	List<HelloEntity> findAll();
	
	@Query("select h.message from HelloEntity h where name = :name")
	String getMessage(@Param("name") String name);
	
}

