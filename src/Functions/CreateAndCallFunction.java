package Functions;

public class CreateAndCallFunction {

	public static void main(String[] args) {
		CreateAndCallFunction f1  = new CreateAndCallFunction();
		f1.print_first();
		f1.print_second();
	    print_third();
		
	}
	public void print_first()
	{
		System.out.println("calling Function if it is in different class");
	}
	
	 void print_second()
	{
		System.out.println("calling Function if it is in same class");
	}
	
	  	static void print_third()
	{
		System.out.println("calling Function if it is in same class (second way)");
	}
}
