package ben.tek.code.labcorp.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ben.tek.code.labcorp.common.ApplicationCache;
import ben.tek.code.labcorp.model.Employee;


@Service
public class EmployeeServices {

	public List<Employee> getEmployeeList() {		
		return ApplicationCache.employeeList;
	}
	
	public List<Employee> addWrokDays(String title, String name, int days) {
		Optional<Employee> emp = ApplicationCache.employeeList.stream().filter(e -> e.getFirstName().equalsIgnoreCase(name)).findAny();
		if(emp.isPresent()) {
			emp.get().work(days);
		}
		else {
			System.out.println("Cannot find " + name);
		}
		return getEmployeeList();
	}
	
	public List<Employee> takeVacation(String title, String name, int days) {
		Optional<Employee> emp = ApplicationCache.employeeList.stream().filter(e -> e.getFirstName().equalsIgnoreCase(name)).findAny();
		if(emp.isPresent()) {
			emp.get().takeVacation((float)days);
		}
		else {
			System.out.println("Cannot find " + name);
		}
		return getEmployeeList();
	}
}
