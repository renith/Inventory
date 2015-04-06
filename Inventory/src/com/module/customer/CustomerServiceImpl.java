package com.module.customer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerServiceInterface {
	
	private final CustomerDaoInterface customerDaoInterface;
	
	@Autowired
	public CustomerServiceImpl(CustomerDaoInterface customerDaoInterface){
		this.customerDaoInterface = customerDaoInterface;
		
	}
	
	@Override
	public List<CustomerEntity> findAll() {
		return customerDaoInterface.findAll();
	}

	@Override
	public String delete(String inventoryId) {
		return customerDaoInterface.delete(inventoryId);
	}

	@Override
	@Transactional
	public String create(CustomerEntity customerEntity) {
		return customerDaoInterface.create(customerEntity);
	}

	@Override
	public String update(String userId) {
		// TODO Auto-generated method stub
		return customerDaoInterface.update(userId);
	}

}
