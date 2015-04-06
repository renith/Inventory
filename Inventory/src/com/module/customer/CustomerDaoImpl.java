package com.module.customer;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDaoImpl implements CustomerDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public List<CustomerEntity> findAll() {
		return null;
	}

	@Override
	public String delete(String inventoryId) {
		return null;
	}

	@Override
	public String create(CustomerEntity customerEntity) {
		int i =  (Integer) this.sessionFactory.getCurrentSession().save(customerEntity);
		System.out.println(i);
		return "success";
	}

	@Override
	public String update(String userId) {
		return null;
	}

}
