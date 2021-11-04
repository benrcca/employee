
Note:
1. This web app can be accessed by endpoints: http://localhost:8080/employee
2. Frontend app has not been created. It can be done later.
3. Data files are under resources: manager.json, hourly.json, salary.json; each contains 10 employees.
4. features:
	a. list all employees: http://localhost:8080/employee/list
	b. add work days to a employee: http://localhost:8080/employee/addworkdays?title=manager&name=Manager1&days=130
	c. employee taks vacation days: http://localhost:8080/employee/takevacation?title=Contractor&name=Contractor1&days=3
5. build app: mvn clean install
6. start services: java -jar target/labcorp-0.0.1-SNAPSHOT.jar