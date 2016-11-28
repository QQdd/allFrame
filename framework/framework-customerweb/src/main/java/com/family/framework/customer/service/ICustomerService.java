package com.family.framework.customer.service;

import java.util.List;

import com.family.framework.customer.vo.CustomerModel;


public interface ICustomerService{

	List<CustomerModel> getByCustomerId();
	
}
