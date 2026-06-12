package Static_24_02;

public class Square_Cube {
	public static int num =5;
	
	public static int square() { 
		
		return num*num;
		
	}
	
	public static void cube() {
		square();
		System.out.println("Cube:"+square()*num);
	}

	public static void main(String[] args) {
		cube();
		
		
		// TODO Auto-generated method stub

	}

}
