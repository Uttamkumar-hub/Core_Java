package Practice_Intsance_Questions;

public class Product {
	String productName;
	int productId;
	double productPrice;
	
	public void addproductDetails(String name, int Id,double Price) {
		productName=name;
		productId=Id;
		productPrice=Price;
	
	}
	String displayProductDetails() {
		return "\nProduct Name:"+productName+
				"\nProduct Id:"+productId+
				"\nproductPrice:"+productPrice;
		
	}

	public static void main(String[] args) {
		Product obj=new Product();
		obj.addproductDetails("Fastrack Smart Watch", 64, 2100.00);
		System.out.println(obj.displayProductDetails());
		

	}

}

