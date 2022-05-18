package com.abhi.Service;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {

	public int resultCountOfEmployee();
	public String displayNameofEmployee(Integer id);
	public Map<String, Object> displayEmployeeNameInASingleLine(Integer id);
	public List<Map<String,Object>> displayAllEmployeeDetailsAcciordingtoTheirJOB(String desg1, String desg2, String desg3);
}
