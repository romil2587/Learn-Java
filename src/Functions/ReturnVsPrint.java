package Functions;

public class ReturnVsPrint {

	public static void main(String[] args) {
		
		//Method 1
		
		System.out.println(getName());
		
		//Method 2 
		int Age = getAge();
		System.out.println(Age);
	}
	
	public static String getName()
	{
		System.out.println("Get name function called");
		return "Romil Singhtwadia";  
	}

	public static int getAge()
	{
		return 38;
	}
}
