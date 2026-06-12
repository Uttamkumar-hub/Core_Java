package Static_24_02;

public class Static_Method {
	public static int a=10;
	public static int b=4;
	
	public static void multiply() {
		System.out.println("Multiplication:"+a*b);
		
	}
	
	public static void showResult() {
		multiply();
		System.out.println("Calculation Done");
		
	}
	

	public static void main(String[] args) {
		showResult();
		// TODO Auto-generated method stub

	}

}
