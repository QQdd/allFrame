package com.family.framework.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.framework.customer.dao.CustomerDAO;
import com.family.framework.customer.vo.CustomerModel;
import com.family.framework.customer.vo.Tb1CustomerExample;


@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
	private CustomerDAO customerDAO;
    
	public  List<CustomerModel> getByCustomerId() {
		Tb1CustomerExample example=new Tb1CustomerExample();
		return customerDAO.selectByExample(example);
	}

	public void create(CustomerModel cm) {
		customerDAO.insert(cm);
	}

	public CustomerModel getByUuid(int customerUuid) {
		return customerDAO.selectByPrimaryKey(customerUuid);
	}

	public void update(CustomerModel cm) {
		customerDAO.updateByPrimaryKey(cm);
	}

	public void delete(int customerUuid) {
		customerDAO.deleteByPrimaryKey(customerUuid);
		
	}
	
	
	
}
