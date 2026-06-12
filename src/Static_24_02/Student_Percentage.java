package Static_24_02;

public class Student_Percentage {
	public static int marks1=78;
	public static int marks2=85;
	public static int marks3=90;
	
	public static void total() {
		System.out.println("Total Marks:"+(78+85+90));
	}
	
	public static void percentage() {
		total();
		System.out.println("Percentage:"+(78+85+90)/3);
	}
	

	public static void main(String[] args) {
		percentage();
		// TODO Auto-generated method stub

	}

}
