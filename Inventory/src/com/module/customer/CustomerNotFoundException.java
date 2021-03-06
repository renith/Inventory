package com.module.customer;

public class CustomerNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String id) {
        super(String.format("No product entry found with id: <%s>", id));
    }

}
