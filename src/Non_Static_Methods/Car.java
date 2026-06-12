package Non_Static_Methods;

public class Car{
	String carMake;
	String carModel;
	int manufacturingYear;
	
	public void addCarDetails(String name, String Model, int Year) {
		carMake=name;
		carModel=Model;
		manufacturingYear=Year;
		
	}
	
	  String displayDetails() {
		  return "Car Make:"+ carMake +  
		  "\nCar Model:" + carModel +
		  "\nManufacturing Year:"+ manufacturingYear ;

	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.addCarDetails("Maruthi", "Baleno", 2024);
		System.out.println(obj.displayDetails());
		// TODO Auto-generated method stub

	}

}
