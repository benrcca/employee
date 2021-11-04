package ben.tek.code.labcorp.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class SalaryEmployee extends Employee {
	
	public static final float VACATION_DAY_MAX = (float) 15.0;
	public static final String SALARY_TYPE = "Salary";
	public static final String TITLE = "Full time employee";
	
	public void work(int days) {
		super.work(days, VACATION_DAY_MAX);
	}
	
	public void takeVacation(float days) {
		super.takeVacation(days, VACATION_DAY_MAX);
	}
	
	public String getTitle() {
		return TITLE;
	}
	
	public String getSalaryType() {
		return SALARY_TYPE;
	}
}
