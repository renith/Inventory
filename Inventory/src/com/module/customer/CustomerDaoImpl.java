package com.module.customer;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.CustomerEntity;

public class CustomerDaoImpl implements CustomerDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerEntity> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from CustomerEntity").list();
	}

	@Override
	public String delete(String inventoryId) {
		return null;
	}

	@Override
	public String create(CustomerEntity customerEntity) {
		String created = "";
		int i =  (Integer) this.sessionFactory.getCurrentSession().save(customerEntity);
		if(i!=0){
			created = "success";
		}else{
			created = "failed";
		}
		return created;
	}

	@Override
	public String update(String userId) {
		return null;
	}

}
