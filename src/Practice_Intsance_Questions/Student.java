package Practice_Intsance_Questions;

public class Student {
	String studentName;
	int studentId;
	double studentMarks;
	
	public void addDetails(String name, int Id, double Marks) {
		studentName=name;
		studentId=Id;
		studentMarks=Marks;
		
	}
	public String displayStudentDetails() {
		return "\nName of the Student:"+studentName+
				"\nStudent ID:"+studentId+
				"\nStudent Marks:"+studentMarks;
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.addDetails("Uttam Kumar", 5, 564.00);
		System.out.println(obj.displayStudentDetails());
		// TODO Auto-generated method stub

	}

}
