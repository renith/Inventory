package com.module.books;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.BooksEntity;
import com.module.books.BooksDaoInterface;

public class BooksServiceImpl implements BooksServiceInterface {
	
	@Autowired
	private BooksDaoInterface adminDao;
	
	@Override
	public BooksEntity findById(String id) {
      return null;
	}
	
	@Override
	public List<BooksEntity> findByBookName(String bookName) {
	  return null;
	}

	@Override
	@Transactional
	public List<BooksEntity> findAll() {
		return adminDao.findAll();
	}
	
	@Override
	public BooksEntity update(String inventoryId) {
		return null;
	}

	@Override
	@Transactional
	public String create(BooksEntity adminEntity) {
       String returnValue = adminDao.create(adminEntity); 
		return returnValue;
	}

	@Override
	@Transactional
	public String delete(String inventoryId) {
		return adminDao.delete(inventoryId);
	}

}
