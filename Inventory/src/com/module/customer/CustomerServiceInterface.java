package com.module.customer;

import java.util.List;

import com.module.beans.CustomerEntity;

public interface CustomerServiceInterface {

	List<CustomerEntity> findAll();

	String delete(String inventoryId);

	String create(CustomerEntity customerEntity);

	String update(String userId);

}
