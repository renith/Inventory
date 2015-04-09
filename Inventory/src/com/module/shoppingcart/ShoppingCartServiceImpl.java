package com.module.shoppingcart;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.ShoppingCartEntity;

public class ShoppingCartServiceImpl implements ShoppingCartServiceInterface{
	
	private ShoppingCartDaoInterface shoppingCartDaoInterface;
	
	@Autowired
	public ShoppingCartServiceImpl(ShoppingCartDaoInterface shoppingCartDaoInterface){
		this.shoppingCartDaoInterface = shoppingCartDaoInterface;
		
	}

	@Override
	@Transactional
	public String create(ShoppingCartEntity shoppingCartEntity) {
		return shoppingCartDaoInterface.create(shoppingCartEntity);
	}

}
