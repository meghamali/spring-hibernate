package zuzu.spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zuzu.constants.Constants;
import zuzu.spring.hibernate.entity.Customer;
import zuzu.spring.hibernate.service.CustomerService;

/**
 * 
 * @author megha @RequestMapping(path="/",
 * method=RequestMethod.GET) @RequestMapping(Constants.RequestMapping.CUSTOMER_LIST)
 *
 */

@Controller
@RequestMapping(Constants.RequestMapping.CUSTOMER)
public class CustomerController {

	@Autowired
	CustomerService theService;

	@GetMapping(Constants.RequestMapping.CUSTOMER_LIST)
	public String listCustomers(Model theModel) {
		theModel.addAttribute(Constants.Model.CUSTOMER, theService.getCustomers());
		return Constants.Views.CUSTOMER_LIST;
	}

	@GetMapping(Constants.RequestMapping.ADD_CUSTOMER)
	public String customerForm(Model theModel) {
		theModel.addAttribute(Constants.Model.CUSTOMER, new Customer());
		return Constants.Views.CUSTOMER_FORM;
	}

	@PostMapping(Constants.RequestMapping.SAVE_CUSTOMER)
	public String saveCustomer(@ModelAttribute(Constants.Model.CUSTOMER) Customer theCustomer, Model theModel) {
		theService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@GetMapping(Constants.RequestMapping.UPDATE_CUSTOMER)
	public String updateCustomerForm(@RequestParam("id") int theId, Model theModel) {
		theModel.addAttribute(Constants.Model.CUSTOMER, theService.getCustomer(theId));
		return Constants.Views.CUSTOMER_FORM;
	}
	@GetMapping(Constants.RequestMapping.DELETE_CUSTOMER)
	public String deleteCustomer(@RequestParam("id") int id) {
		System.out.println("inside delete"+id);
		theService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
