package com.abhi.Service;

import java.util.List;
import java.util.Map;

import com.abhi.DAO.IDAOEmployee;

public class EmployeeService implements IEmployeeService{

	//Has-A relation
	private IDAOEmployee ide;
	public EmployeeService(IDAOEmployee ide) {
		this.ide = ide;
		System.out.println("EmployeeService.EmployeeService()");
	}
	@Override
	public int resultCountOfEmployee() {
      int results=ide.employeeCount();
		return results;
	}
	
	@Override
	public String displayNameofEmployee(Integer id) {
      String results=ide.findEmployeeByid(id);
		return results;
	}
	
	@Override
	public Map<String, Object> displayEmployeeNameInASingleLine(Integer id) {
     Map<String, Object> mps=ide.findSingleEmployeeDetails(id);
		return mps;
	}
	
	@Override
	public List<Map<String, Object>> displayAllEmployeeDetailsAcciordingtoTheirJOB(String desg1, String desg2,
			String desg3) {
      List<Map<String, Object>> lmp=ide.findAllEmployeeDetailsByJOB(desg1, desg2, desg3);
		return lmp;
	}
	
	
	
	
}
