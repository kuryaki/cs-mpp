package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Admin {
	
	List<Department> departments;
	String report;
	
	public Admin(Department[] departments) {
		this.departments = new ArrayList<Department>(Arrays.asList(departments));
	}
	
	public String hourlyCompanyMessage() {
		
		report = "";
		
		departments.forEach(department -> {
			report += format(department.getName(), department.nextMessage());
		});
		
		return report;
	}

	private String format(String name, String message) {
		return name + ": " + message + "\n";
	}
	
}
