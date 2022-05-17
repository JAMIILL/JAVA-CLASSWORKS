package classroom;

public class Employeedetails {

	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee name: "+empName+" "+"Emp id:  "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee address:"+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee salary:"+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Employee Name:"+mobNum);
	}
	public static void main(String[] args) {
		
   Employeedetails cal =new Employeedetails();
   cal.printEmployeeName("jameel",800669);
   cal.getEmployeeAddress("Chennai");
	cal.printEmployeeSalary(3000.8682362);
	cal.printEmployeeMobileNumber(9776886875435435L);
   
	}

}
