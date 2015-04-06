package com.module.admin;

import java.util.List;

public interface AdminServiceInterface {

	public AdminEntity findById(String id);

	public List<AdminEntity> findAll();

	public List<AdminEntity> findByBookName(String bookName);

	public AdminEntity update(String inventoryId);

	public String create(AdminEntity adminEntity);

	public String delete(String inventoryId);

}
