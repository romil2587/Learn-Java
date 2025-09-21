package MethodOverloading;

public class TryCatch {

	public static void main(String[] args) {
		int a=10;
		try {
		System.out.println(10/0);
		}
		catch(Exception e)
		{
			// System.out.println("You can't divide a number by zero");          this is your customize error
			System.out.println(e);                                               // predefine java error
		}
            System.out.println("Rest of the code");
	}

}
