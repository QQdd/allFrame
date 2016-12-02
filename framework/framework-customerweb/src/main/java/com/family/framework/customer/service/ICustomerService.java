package com.family.framework.customer.service;

import java.util.List;

import com.family.framework.customer.vo.CustomerModel;


public interface ICustomerService{

	List<CustomerModel> getByCustomerId();

	void create(CustomerModel cm);

	CustomerModel getByUuid(int customerUuid);

	void update(CustomerModel cm);

	void delete(int customerUuid);
	
}
