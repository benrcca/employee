package ben.tek.code.labcorp.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Component
public abstract class Employee {
	
	public static final int WORK_DAY_MAX = 260;
	
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	
	protected int workDays = 0;
	protected float vacationDays = (float) 0.0;
	
	public abstract void work(int days);
	public abstract void takeVacation(float days);
	
	protected void work(int days, float VACATION_DAY_MAX) {
		if(this.workDays + days > WORK_DAY_MAX) {
			this.vacationDays = this.vacationDays + (((WORK_DAY_MAX - this.workDays) * VACATION_DAY_MAX)/WORK_DAY_MAX);
			this.workDays = WORK_DAY_MAX;
		}
		else {
			this.workDays = this.workDays + days;
			this.vacationDays = this.vacationDays + ((((float)days) * VACATION_DAY_MAX)/WORK_DAY_MAX);
		}
	}
	
	protected void takeVacation(float days, float VACATION_DAY_MAX) {
		if(days > this.vacationDays) {
			this.vacationDays = (float)0;
		}
		else {
			this.vacationDays = this.vacationDays - days;
		}
	}
	
	abstract String getTitle();
	abstract String getSalaryType();
}
