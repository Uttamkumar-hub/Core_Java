package Task_20_02;

public class Electricity_bill {
	public static void Bill(String name, int units) {
		System.out.println("Customer name:"+name);
		System.out.println("Units Consumed:"+units);
		System.out.println("Total Bill:"+units*5);
		
	}

	public static void main(String[] args) {
		Bill("Uttam Kumar",100);
		
	}

}
