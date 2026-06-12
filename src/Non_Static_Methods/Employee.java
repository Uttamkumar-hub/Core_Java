package Non_Static_Methods;

public class Employee {
	public String employeeName;
	public int employeeId;
	public double employeeSalary;
	
	public void addEmployeeDetails(String name,int id, double Salary) {
		employeeName=name;
		employeeId=id;
		employeeSalary=Salary;
		
	}
	
	public String displayDetails() {
		 return "Employee Name:"+employeeName+
		"\nEmployee ID:"+employeeId+
		"\nEmployee salary:"+employeeSalary;
		
		
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.addEmployeeDetails("Uttam Kumar",64,20000.0);
		System.out.println(obj.displayDetails());

	}

}
