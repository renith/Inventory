package com.module.order;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.OrderEntity;

public class OrderDaoImpl implements OrderDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public String create(OrderEntity orderEntity) {
		int i =  (Integer) this.sessionFactory.getCurrentSession().save(orderEntity);
		System.out.println(i);
		return "success";	
	}

}
