package Static_24_02;

public class TotalStudentCounter {
	public static int studentCount=0;
	
	public static void addStudents(int n) {
		studentCount +=n;
		
	}

	public static void main(String[] args) {
		addStudents(10);
		addStudents(25);
		addStudents(30);
		System.out.println("The final count:"+studentCount);
		
		// TODO Auto-generated method stub

	}

}
