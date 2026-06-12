package Non_Static_Methods;

public class Book {
	String bookTitle;
	String author;
	String isbn;
	
	public void addBookDetails(String a, String kavi, String bookisbn) {
		bookTitle=a;
		author=kavi;
		isbn=bookisbn;
		
	}
	
	public String println() {
		return "Name of the Title:"+bookTitle+
				"\nAuthor:"+author+
				"\nISBN:"+isbn;
	}
	public static void main(String[] args) {
		Book obj=new Book();
		obj.addBookDetails("Ayodhya Cherina Krishna","Srinivas Kamisetty","978-9334408577");
		System.out.println(obj.println());
	

	}

}
