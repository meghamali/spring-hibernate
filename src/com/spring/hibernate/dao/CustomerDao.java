package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();
	void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);

}
