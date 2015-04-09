package com.module.customer;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.module.beans.CustomerEntity;


@RestController
@RequestMapping("/customerDetails")
public class CustomerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	private final CustomerServiceInterface customerService;
	
	@Autowired
	public CustomerController(CustomerServiceInterface customerService){
		this.customerService = customerService;
		
	}
	
     @RequestMapping(method=RequestMethod.POST)
	 @ResponseStatus(HttpStatus.CREATED)
     public String create(@RequestBody CustomerEntity customerEntity){
 		 String create = customerService.create(customerEntity);
    	 return create;
    }
     
     
     @RequestMapping(method = RequestMethod.GET)
     List<CustomerEntity> findAll() {
         List<CustomerEntity> customer = customerService.findAll();
         return customer;
     }
 			
 	 @RequestMapping(value = "{userId}", method = RequestMethod.GET)
 	 CustomerEntity findById(@PathVariable("userId") String userId) {
 		 System.out.println(userId);
 		 return null;
 	    }
 	 
 	 @RequestMapping(method=RequestMethod.DELETE, value="{userId}")
 	  public void delete(@PathVariable("userId") String userId) {
        String deleteId = customerService.delete(userId);
 	 }
 	  
 	  @RequestMapping(method=RequestMethod.PUT, value="{userId}")
 	  public CustomerEntity update(@PathVariable("userId") String userId, @RequestBody CustomerEntity customerEntity) {
 		  String updateId = customerService.update(userId);
 		  System.out.println(" InventoryId----"+userId+"  first Name---"+customerEntity.getFirstName()+" city--" +customerEntity.getCity());
 		  return null;
 	  }
 	  
 	 @ExceptionHandler
	 @ResponseStatus(HttpStatus.NOT_FOUND)
	 public void handleCustomerNotFound(CustomerNotFoundException ex) {
	      LOGGER.error("Handling error with message: {}", ex.getMessage());
	  }

  }
