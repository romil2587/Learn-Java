package OOPS;

public class Static_Classes {

	public static void main(String[] args) {
	Library l1 =new Library();
	l1.getLibraryDetails();
	Library.Books b1 = new Library.Books();
	b1.getBooksDetails();		
	}

}

class Library{
	static String name = "Romil Singhtwadia";
	static class Books{
		public void getBooksDetails() {
			System.out.println("Books Details");
			System.out.println(name);
		}
	}
	public void getLibraryDetails() {
		System.out.println("Library Details");
		
	}
}