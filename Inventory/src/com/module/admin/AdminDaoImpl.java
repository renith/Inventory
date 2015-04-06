package com.module.admin;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminDaoImpl implements AdminDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public String create(AdminEntity adminEntity) {

		int i =  (Integer) this.sessionFactory.getCurrentSession().save(adminEntity);
		return "success";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdminEntity> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from AdminEntity").list();
	}

	@Override
	public String delete(String inventoryId) {
		this.sessionFactory.getCurrentSession().delete(inventoryId);
		return null;
	}

}
