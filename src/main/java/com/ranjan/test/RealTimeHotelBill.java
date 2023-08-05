package com.ranjan.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ranjan.controller.MainController;
import com.ranjan.vo.CustomerVO;

public class RealTimeHotelBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cname; String cadd; String roomno; String perday; String daystay;
		System.out.println("Enter Customer name ");
		cname=sc.next();
		System.out.println("Enter Customer add ");
		cadd=sc.next();
		System.out.println("Enter Customer room no ");
		roomno=sc.next();
		System.out.println("Enter per day charge ");
		perday=sc.next();
		System.out.println("Enter no of day stayed ");
		daystay=sc.next();
		
		CustomerVO vo = new CustomerVO();
		vo.setCname(cname); vo.setCadd(cadd); vo.setRoomno(roomno); vo.setPerday(perday); 
		vo.setDaystay(daystay);
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ranjan/cfgs/applicationContext.xml");
		//get controller class object
		MainController controller = factory.getBean("controller", MainController.class);
		try {
			String resultMsg = controller.processCustomer(vo);
			System.out.println(resultMsg);
		}catch(Exception e) {
			System.out.println("Problem in checkout : "+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
