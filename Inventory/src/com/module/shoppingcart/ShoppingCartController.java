package com.module.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.module.beans.ShoppingCartEntity;

@RestController
@RequestMapping("/shoppingCartDetails")
public class ShoppingCartController {
	
	private final ShoppingCartServiceInterface shoppingCartServiceInterface;
	
	@Autowired
	public ShoppingCartController(ShoppingCartServiceInterface shoppingCartServiceInterface){
		this.shoppingCartServiceInterface = shoppingCartServiceInterface; 
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	String create(@RequestBody ShoppingCartEntity shoppingCartEntity){
		String create = shoppingCartServiceInterface.create(shoppingCartEntity);
		return "created";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	List<ShoppingCartEntity> findAll(){
		
		return null;
	}
	
	@RequestMapping(value = "{shoppingCartId}" , method = RequestMethod.GET)
	List<ShoppingCartEntity> findById(@PathVariable("shoppingCartId") int shoppingCartId){
		return null;
		
	}
	
	@RequestMapping(value = "/userId" , method = RequestMethod.POST)
	String findByUserId(@PathVariable("userId") int userId){
		return null;
		
	}
	
	@RequestMapping(value = "{date}" , method = RequestMethod.GET)
	List<ShoppingCartEntity> findByDate(@PathVariable("date") String date){
		return null;
		
	}
	
	@RequestMapping(value = "{shoppingCartId}" , method = RequestMethod.PUT)
	String update(@PathVariable("shoppingCartId") int shoppingCartId , @RequestBody ShoppingCartEntity shoppingCartEntity){
		return null;
		
	}
	
	@RequestMapping(value = "{shoppingCartId}" , method = RequestMethod.DELETE)
	String delete(@PathVariable("shoppingCartId") int shoppingCartId){
		return null;
		
	}

}
