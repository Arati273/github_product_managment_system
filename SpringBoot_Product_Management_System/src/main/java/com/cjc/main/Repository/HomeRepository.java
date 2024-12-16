package com.cjc.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Product;

@Repository
public interface  HomeRepository  extends CrudRepository<Product,Integer> 
{

	
	
	
	
}
