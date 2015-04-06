package com.module.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminServiceInterface {
	
	@Autowired
	private AdminDaoInterface adminDao;
	
	@Override
	public AdminEntity findById(String id) {
      return null;
	}
	
	@Override
	public List<AdminEntity> findByBookName(String bookName) {
	  return null;
	}

	@Override
	@Transactional
	public List<AdminEntity> findAll() {
		return adminDao.findAll();
	}
	
	@Override
	public AdminEntity update(String inventoryId) {
		return null;
	}

	@Override
	@Transactional
	public String create(AdminEntity adminEntity) {
       String returnValue = adminDao.create(adminEntity); 
		return returnValue;
	}

	@Override
	@Transactional
	public String delete(String inventoryId) {
		return adminDao.delete(inventoryId);
	}

}
