package Static_24_02;

public class Marks_Calculation {
	public static int sub1=85;
	public static int sub2=90;
	public static int sub3=80;
	
	public static void totalMarks() {
	System.out.println("totalMarks="+(sub1+sub2+sub3));	
	}
	
	public static void averageMarks() {
		int avg=(sub1+sub2+sub3/3);
		System.out.println("Average Marks="+avg);
	}

	public static void main(String[] args) {
		totalMarks();
		averageMarks();
		
		// TODO Auto-generated method stub

	}

}
