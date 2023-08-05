package com.ranjan.service;

import com.ranjan.bo.CustomerBO;
import com.ranjan.dao.CustomerDAO;
import com.ranjan.dto.CustomerDTO;

public class CustomerService implements ICustomerService {

	private CustomerDAO dao;
	
	public CustomerService(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		
		double billamt = 0.0;
		billamt = dto.getPerday()*dto.getDaystay();
		CustomerBO bo = new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setRoomno(dto.getRoomno());
		bo.setBillamt(billamt);
		
		int count = dao.insert(bo);
		
		return count==0?"Checkout Fail":"Checkout Successful, : Total Bill Amount : "+billamt;
	}

}
