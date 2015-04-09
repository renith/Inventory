package com.module.shoppingcart;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.ShoppingCartEntity;

public class ShoppingCartDaoImpl implements ShoppingCartDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public String create(ShoppingCartEntity shoppingCartEntity) {
		String created = "";
		int i =  (Integer) this.sessionFactory.getCurrentSession().save(shoppingCartEntity);
		if(i!=0){
			created = "success";
		}else{
			created = "failed";
		}
		return created;
	}

}
