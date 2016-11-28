package com.family.framework.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.family.framework.customer.dao.CustomerDAO;
import com.family.framework.customer.vo.CustomerModel;
import com.family.framework.customer.vo.Tb1CustomerExample;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	//User接口  
    @Autowired(required=true)
	private  CustomerDAO dao = null;
    
	public  List<CustomerModel> getByCustomerId() {
		Tb1CustomerExample example=new Tb1CustomerExample();
		return dao.selectByExample(example);
	}
	
}
