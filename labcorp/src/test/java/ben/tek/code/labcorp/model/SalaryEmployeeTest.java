package ben.tek.code.labcorp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryEmployeeTest {

	@Test
	void testWork() {
		Employee emp = new SalaryEmployee();
		emp.work(100);
		System.out.println(((float)100*(float)15)/260);
		System.out.println(emp.getVacationDays());
		
		assertEquals(((float)100*(float)15)/260, emp.getVacationDays());
		assertEquals("Full time employee", emp.getTitle());
		assertEquals("Salary", emp.getSalaryType());
		emp.work(30);
		assertEquals(((float)130*(float)15)/260, emp.getVacationDays());
		
		emp.takeVacation((float)3);
		assertEquals((((float)130*(float)15)/260)-(float)3, emp.getVacationDays());
	}

}
