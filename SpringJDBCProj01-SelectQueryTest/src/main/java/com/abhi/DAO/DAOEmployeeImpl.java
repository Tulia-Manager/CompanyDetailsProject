package com.abhi.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOEmployeeImpl implements IDAOEmployee{
//Query
	private final static String COUNT_EMPLOYEE_QUERRY="SELECT COUNT(*) FROM EMP";
	private final static String FIND_EMPLOYEE_QUERY="SELECT ENAME FROM EMP WHERE EMPNO=?";
	private final static String FIND_SINGLE_EMPLOYEEDETAILS_QUERY="SELECT EMPNO,ENAME,JOB,HIREDATE,SAL FROM EMP WHERE EMPNO=?";
	private final static String FIND_MULTIPLE_EMPLOYEEDETAILS_QUERY="SELECT EMPNO,ENAME,JOB,HIREDATE,SAL FROM EMP WHERE JOB IN(?,?,?)";
    	
	//HAS-A relation
    private JdbcTemplate jt;
    

	public DAOEmployeeImpl(JdbcTemplate jt) {
		this.jt = jt;
		System.out.println("DAOEmployeeImpl.DAOEmployeeImpl():1-param constructor");
	}

	@Override
	public int employeeCount() {
		int count=jt.queryForObject(COUNT_EMPLOYEE_QUERRY, Integer.class);
		return count;
	}
	
	@Override
		public String findEmployeeByid(Integer id) {
        String empname=jt.queryForObject(FIND_EMPLOYEE_QUERY,String.class,id);
		return empname;
		}
	
	@Override
		public Map<String, Object> findSingleEmployeeDetails(Integer id) {
         Map<String, Object> mp=jt.queryForMap(FIND_SINGLE_EMPLOYEEDETAILS_QUERY,id);
		return mp;
		}
	
	@Override
		public List<Map<String, Object>> findAllEmployeeDetailsByJOB(String desg1, String desg2, String desg3) {
         List<Map<String, Object>> ll=jt.queryForList(FIND_MULTIPLE_EMPLOYEEDETAILS_QUERY,desg1,desg2,desg3);
		return ll;
		}
	
	
}
