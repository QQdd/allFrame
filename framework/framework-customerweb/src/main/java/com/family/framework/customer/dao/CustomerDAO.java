package com.family.framework.customer.dao;

import org.springframework.stereotype.Repository;

import com.family.framework.common.dao.BaseDAO;
import com.family.framework.customer.vo.CustomerModel;
import com.family.framework.customer.vo.CustomerQueryModel;

@Repository  //如果想用xml扫描就注解
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
