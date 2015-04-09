package com.module.order;

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

import com.module.beans.OrderEntity;
import com.module.customer.CustomerController;
import com.module.customer.CustomerNotFoundException;

@RestController
@RequestMapping("/orderDetails")
public class OrderController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	private final OrderServiceInterface orderServiceInterface;
	
	@Autowired
	public OrderController(OrderServiceInterface orderServiceInterface){
		this.orderServiceInterface = orderServiceInterface;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	String create(@RequestBody OrderEntity orderEntity){
		return orderServiceInterface.create(orderEntity);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	List<OrderEntity> findAll(){
		return null;
		
	}
	
	@RequestMapping(value = "{orderId}" , method = RequestMethod.GET)
	OrderEntity findByOrderId(@PathVariable("orderId") int orderId){
		return null;
		
	}
	
	@RequestMapping(value = "{userId}" , method = RequestMethod.POST)
	OrderEntity findByUserId(@PathVariable("userId") int userId){
		return null;
		
	}
	
	@RequestMapping(value = "{orderId}" , method = RequestMethod.PUT)
	String update(@PathVariable("orderId") int orderId,@RequestBody OrderEntity orderEntity){
		return null;
		
	}
	
	@RequestMapping(value = "{orderId}" , method = RequestMethod.DELETE)
	String delete(@PathVariable("orderId") int oderId){
		return null;
		
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleCustomerNotFound(CustomerNotFoundException ex) {
	      LOGGER.error("Handling error with message: {}", ex.getMessage());
	  }

}
