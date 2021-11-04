package ben.tek.code.labcorp.model;

import org.springframework.stereotype.Component;


@Component
public class Manager extends SalaryEmployee {
	
	public static final float VACATION_DAY_MAX = 30;
	public static final String TITLE = "Manager";
	
	
	
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
