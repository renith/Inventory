package com.module.order;

public class OrderNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException(String id) {
        super(String.format("No product entry found with id: <%s>", id));
    }


}
