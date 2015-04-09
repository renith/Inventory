package com.module.order;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.OrderEntity;

public class OrderServiceImpl implements OrderServiceInterface{
	
	private final OrderDaoInterface orderDaoInterface;

	@Autowired
	public OrderServiceImpl(OrderDaoInterface orderDaoInterface){
		this.orderDaoInterface = orderDaoInterface;
		
	}
	
	@Override
	@Transactional
	public String create(OrderEntity orderEntity) {
		return orderDaoInterface.create(orderEntity);
	}

}
