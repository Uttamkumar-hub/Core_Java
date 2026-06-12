package Non_Static_Methods;

public class Product {
	public String productName;
	public int productId;
	public double productPrice;
	
	public void addProductDetails(String Name, int Id, double Price) {
		productName=Name;
		productId=Id;
		productPrice=Price;
		
	}
	
	public String display() {
		return "Name of the Product:"+productName+
		"\nID Number:"+productId+
		"\nPrice:"+productPrice;
	}

	public static void main(String[] args) {
		Product obj=new Product();
		obj.addProductDetails("IQOO", 564, 24999);
		System.out.println(obj.display());
		

	}

}
