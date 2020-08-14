package zuzu.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zuzu.spring.hibernate.dao.CustomerDao;
import zuzu.spring.hibernate.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao dao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers(){
		return dao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		dao.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return dao.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		dao.deleteCustomer(id);
	}
}
