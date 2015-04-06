package com.module.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	public AdminController()
	{
	}
	
	@Autowired
	private AdminServiceInterface adminService;
			
	@RequestMapping(method = RequestMethod.POST)
	String create(@RequestBody AdminEntity adminEntity)
	{
		String returnValue = adminService.create(adminEntity);
		return "success";
	}
	
	@RequestMapping(value = "{bookName}", method = RequestMethod.POST)
    List<AdminEntity> findByBookName(@PathVariable("bookName") String bookName) {
		System.out.println("bookName--"+bookName);
      	return null;
	}
	
	@RequestMapping(method = RequestMethod.GET)
    List<AdminEntity> findAll() {
        List<AdminEntity> admin = adminService.findAll();
        return admin;
    }
			
	 @RequestMapping(value = "{inventoryId}", method = RequestMethod.GET)
	 AdminEntity findById(@PathVariable("inventoryId") String id) {
		 System.out.println(id);
		 return null;
	    }
	 
	 @RequestMapping(method=RequestMethod.DELETE, value="{inventoryId}")
	  public void delete(@PathVariable("inventoryId") String inventoryId) {
       String deleteId = adminService.delete(inventoryId);
	 }
	  
	  @RequestMapping(method=RequestMethod.PUT, value="{inventoryId}")
	  public AdminEntity update(@PathVariable("inventoryId") String inventoryId, @RequestBody AdminEntity adminEntity) {
		  System.out.println(" InventoryId----"+inventoryId+"  book Name---"+adminEntity.getBookName()+" authorName--" +adminEntity.getAuthor());
		  return null;
	  }
	 
	

}
