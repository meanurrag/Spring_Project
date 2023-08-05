package com.ranjan.controller;

import com.ranjan.dto.CustomerDTO;
import com.ranjan.service.CustomerService;
import com.ranjan.vo.CustomerVO;

public class MainController {

	private CustomerService service;

	public MainController(CustomerService service) {
		System.out.println("MainController : 1 Param Constructor)");
		this.service = service;
	}
	public String processCustomer(CustomerVO vo)throws Exception{
		
		CustomerDTO dto = new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setRoomno(Integer.parseInt(vo.getRoomno()));
		dto.setPerday(Double.parseDouble(vo.getPerday()));
		dto.setDaystay(Integer.parseInt(vo.getDaystay()));
		
		String resultMsg = service.registerCustomer(dto);
		return resultMsg;
	}
}
