package Practice_Intsance_Questions;

public class Car {
	String carBrand;
	String carModel;
	double carPrice;
	
	public void addCarDetails(String Brand, String Model, double Price) {
		carBrand=Brand;
		carModel=Model;
		carPrice=Price;
	}
	String displayCarDetails() {
		return "\nCar Brand:"+carBrand+
				"\nModel:"+carModel+
				"\nPrice:"+carPrice;
				
		
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.addCarDetails("Maruthi","Fronx", 1200000.0);
		System.out.println(obj.displayCarDetails());
		// TODO Auto-generated method stub

	}

}
