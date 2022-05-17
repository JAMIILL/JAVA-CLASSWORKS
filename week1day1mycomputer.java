package classroom;

import ASSIGNMENTS.Employeedetails;

public class week1day1mycomputer {

public static void main(String[] args) {
	int a=4,b=4,c;
	c=a+b;
	System.out.println("c=" + c);
	  Employeedetails cal= new Employeedetails();
	  cal.Employeename("JAMEEL",800669);
	  cal.getEmployeeAddress("chennai");
	  cal.printEmployeeSalary(35000.000);
	  cal.printEmployeeMobileNumber(987654321L);
}
}