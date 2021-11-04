package ben.tek.code.labcorp.controller;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ben.tek.code.labcorp.model.Employee;
import ben.tek.code.labcorp.services.EmployeeServices;


@ResponseBody
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServices services;
	
	@RequestMapping("/employee/list")
	public List<Employee> getEmployeeList() throws IOException, URISyntaxException{
		
		return services.getEmployeeList();
	}
	
	@RequestMapping("/employee/addworkdays")
	public List<Employee> addWorkDays(@RequestParam(name = "title") String title, @RequestParam(name = "name") String name, @RequestParam(name = "days") int days) throws IOException, URISyntaxException{
	
		return services.addWrokDays(title, name, days);
	}
	
	@RequestMapping("/employee/takevacation")
	public List<Employee> takeVacation(@RequestParam(name = "title") String title, @RequestParam(name = "name") String name, @RequestParam(name = "days") int days) throws IOException, URISyntaxException{
	
		return services.takeVacation(title, name, days);
	}
}
