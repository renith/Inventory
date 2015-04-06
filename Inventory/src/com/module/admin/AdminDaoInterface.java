package com.module.admin;

import java.util.List;

public interface AdminDaoInterface  {

	public String create(AdminEntity adminEntity);

	public List<AdminEntity> findAll();

	public String delete(String inventoryId); 
}
