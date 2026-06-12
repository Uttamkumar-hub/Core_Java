package Task_20_02;

public class Cab_fare {
	public static void println (String name, double distance) {
		double fare=10.0*distance;
		System.out.println("Customer Name:"+name);
		System.out.println("Distance Travelled:"+distance +"kms");
		System.out.println("Total Fare:"+fare );
		
	}

	public static void main(String[] args) {
		println("Uttam Kumar",25);

	}

}
