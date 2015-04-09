package com.module.books;

import java.util.List;

import com.module.beans.BooksEntity;

public interface BooksServiceInterface {

	public BooksEntity findById(String id);

	public List<BooksEntity> findAll();

	public List<BooksEntity> findByBookName(String bookName);

	public BooksEntity update(String inventoryId);

	public String create(BooksEntity adminEntity);

	public String delete(String inventoryId);

}
