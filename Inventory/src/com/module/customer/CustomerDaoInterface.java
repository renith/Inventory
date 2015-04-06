package com.module.customer;

import java.util.List;

public interface CustomerDaoInterface {

	public List<CustomerEntity> findAll(); 

	public String delete(String inventoryId);

	public String create(CustomerEntity customerEntity);

	public String update(String userId);

}
