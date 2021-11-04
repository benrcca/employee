package ben.tek.code.labcorp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testWork() {
		Employee emp = new Manager();
		emp.work(130);
		assertEquals(15,emp.getVacationDays());
		assertEquals("Manager", emp.getTitle());
		assertEquals("Salary", emp.getSalaryType());
	}

}
