package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);

}
