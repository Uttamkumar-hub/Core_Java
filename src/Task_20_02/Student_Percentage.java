package Task_20_02;

public class Student_Percentage {
	public static void Marks(String name, int Maths,int Science, int English) {
		int Total=Maths+Science+English;
		int Percentage=(Total*100)/300;
		System.out.println("Name of the Student:"+name);
		System.out.println("Total_Marks:"+Total);
		System.out.println("Percentage obtained:"+Percentage + "%");
	}

	public static void main(String[] args) {
		Marks("Uttam Kumar", 85,95,98);
	

	}

}
