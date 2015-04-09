package com.module.books;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.module.beans.BooksEntity;

public class BooksDaoImpl implements BooksDaoInterface {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public String create(BooksEntity bookEntity) {
		
        String created = "";
		int i =  (Integer) this.sessionFactory.getCurrentSession().save(bookEntity);
		if(i!=0){
			created = "success";
		}else{
			created = "failed";
		}
				
		return created;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BooksEntity> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from BooksEntity").list();
	}

	@Override
	public String delete(String inventoryId) {
		this.sessionFactory.getCurrentSession().delete(inventoryId);
		return null;
	}

}
