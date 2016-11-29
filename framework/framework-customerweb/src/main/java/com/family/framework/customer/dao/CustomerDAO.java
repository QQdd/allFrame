package com.family.framework.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.family.framework.customer.vo.CustomerModel;
import com.family.framework.customer.vo.Tb1CustomerExample;


public interface CustomerDAO{
	 int countByExample(Tb1CustomerExample example);

	    int deleteByExample(Tb1CustomerExample example);

	    int deleteByPrimaryKey(Integer uuid);

	    int insert(CustomerModel record);

	    int insertSelective(CustomerModel record);

	    List<CustomerModel> selectByExample(Tb1CustomerExample example);

	    CustomerModel selectByPrimaryKey(Integer uuid);

	    int updateByExampleSelective(@Param("record") CustomerModel record, @Param("example") Tb1CustomerExample example);

	    int updateByExample(@Param("record") CustomerModel record, @Param("example") Tb1CustomerExample example);

	    int updateByPrimaryKeySelective(CustomerModel record);

	    int updateByPrimaryKey(CustomerModel record);
	
}
