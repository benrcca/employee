package ben.tek.code.labcorp.common;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import ben.tek.code.labcorp.model.Employee;
import ben.tek.code.labcorp.model.HourlyEmployee;
import ben.tek.code.labcorp.model.Manager;
import ben.tek.code.labcorp.model.SalaryEmployee;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unchecked")
@Setter
@Getter
@Component
public class ApplicationCache {
	
	public static List<Employee> employeeList = new ArrayList<Employee>();
	
	static{
		ObjectMapper mapper = new ObjectMapper();
		try {
			InputStream inputStream = new ClassPathResource("manager.json").getInputStream();
			String jsonStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			List<LinkedHashMap> mapList = mapper.readValue(jsonStr, ArrayList.class);
			for(LinkedHashMap map : mapList) {
				Manager mgr = new Manager();
				mgr.setFirstName(map.get("firstName").toString());
				mgr.setLastName(map.get("lastName")==null? "null" : map.get("lastName").toString());
				mgr.setPhoneNumber(map.get("phoneNumber")==null? "null" : map.get("phoneNumber").toString());
				employeeList.add(mgr);
			}
			
			inputStream = new ClassPathResource("salary.json").getInputStream();
			jsonStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			mapList = mapper.readValue(jsonStr, ArrayList.class);
			for(LinkedHashMap map : mapList) {
				SalaryEmployee salaryEmp = new SalaryEmployee();
				salaryEmp.setFirstName(map.get("firstName").toString());
				salaryEmp.setLastName(map.get("lastName")==null? "null" : map.get("lastName").toString());
				salaryEmp.setPhoneNumber(map.get("phoneNumber")==null? "null" : map.get("phoneNumber").toString());
				employeeList.add(salaryEmp);
			}
			
			inputStream = new ClassPathResource("hourly.json").getInputStream();
			jsonStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			mapList = mapper.readValue(jsonStr, ArrayList.class);
			for(LinkedHashMap map : mapList) {
				HourlyEmployee hourlyEmp = new HourlyEmployee();
				hourlyEmp.setFirstName(map.get("firstName").toString());
				hourlyEmp.setLastName(map.get("lastName")==null? "null" : map.get("lastName").toString());
				hourlyEmp.setPhoneNumber(map.get("phoneNumber")==null? "null" : map.get("phoneNumber").toString());
				employeeList.add(hourlyEmp);
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
