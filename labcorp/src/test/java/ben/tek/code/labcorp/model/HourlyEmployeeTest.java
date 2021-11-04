package ben.tek.code.labcorp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HourlyEmployeeTest {

	@Test
	void testWork() {
		Employee emp = new HourlyEmployee();
		emp.work(130);
		assertEquals(5,emp.getVacationDays());
		assertEquals("Contractor", emp.getTitle());
		assertEquals("Hourly", emp.getSalaryType());
	}

}
