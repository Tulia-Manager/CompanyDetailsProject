package com.abhi.DAO;

import java.util.List;
import java.util.Map;

public interface IDAOEmployee {
	
	public int employeeCount();
	public String findEmployeeByid(Integer id);
	public Map<String, Object> findSingleEmployeeDetails(Integer id);
	public List<Map<String, Object>> findAllEmployeeDetailsByJOB(String desg1,String desg2,String desg3);

}
