package com.module.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.module.beans.BooksEntity;

@RestController
@RequestMapping("/bookDetails")
public class BooksController {
	
	public BooksController()
	{
	}
	
	@Autowired
	private BooksServiceInterface adminService;
			
	@RequestMapping(method = RequestMethod.POST)
	String create(@RequestBody BooksEntity adminEntity)
	{
		String create = adminService.create(adminEntity);
		return create;
	}
	
	@RequestMapping(value = "{bookName}", method = RequestMethod.POST)
    List<BooksEntity> findByBookName(@PathVariable("bookName") String bookName) {
      	return null;
	}
	
	@RequestMapping(method = RequestMethod.GET)
    List<BooksEntity> findAll() {
        List<BooksEntity> booksDetails = adminService.findAll();
        return booksDetails;
    }
			
	 @RequestMapping(value = "{inventoryId}", method = RequestMethod.GET)
	 BooksEntity findById(@PathVariable("inventoryId") String id) {
		 System.out.println(id);
		 return null;
	    }
	 
	 @RequestMapping(method=RequestMethod.DELETE, value="{inventoryId}")
	  public void delete(@PathVariable("inventoryId") String inventoryId) {
       String deleteId = adminService.delete(inventoryId);
	 }
	  
	  @RequestMapping(method=RequestMethod.PUT, value="{inventoryId}")
	  public BooksEntity update(@PathVariable("inventoryId") String inventoryId, @RequestBody BooksEntity adminEntity) {
		  return null;
	  }
	 
	

}
