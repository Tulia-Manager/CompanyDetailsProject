package com.abhi.Test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.abhi.Service.EmployeeService;

public class EmployeeCountTestWithSpringJDBC {

	public static void main(String[] args) {
   
		//create container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/abhi/cfgs/applicationContext.xml");
        //get service class obj
		EmployeeService emp=ctx.getBean("service",EmployeeService.class);
		//to call method from employee
		try {
        System.out.println("==========Employee Counts(QueryForObject)============");
		int empcount=emp.resultCountOfEmployee();
		System.out.println("Total Employee are ::"+empcount);
		System.out.println("==========Employee Name(QueryForObject)============");
		String empname=emp.displayNameofEmployee(7499);
		System.out.println("Employee Name ::"+empname);
		System.out.println("========Display Employee Name in a Single Line(QueryForMap)==============");
		Map<String, Object> mp =emp.displayEmployeeNameInASingleLine(7499);
		System.out.println("Employee Details :"+mp);
		List<Map<String, Object>> lmp=emp.displayAllEmployeeDetailsAcciordingtoTheirJOB("CLERK","SENG","SALESMAN");
		lmp.forEach(System.out::println);
		
		
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
	}

}
