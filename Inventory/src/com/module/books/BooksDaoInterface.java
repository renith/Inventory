package com.module.books;

import java.util.List;

import com.module.beans.BooksEntity;

public interface BooksDaoInterface  {

	public String create(BooksEntity adminEntity);

	public List<BooksEntity> findAll();

	public String delete(String inventoryId); 
}
