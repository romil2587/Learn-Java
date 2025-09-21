package MethodOverloading;

public class ThrowsForFunction {

	public static void main(String[] args) {
	try {
		checkAge();        // to call a function if it is in same class.In this function should be static
	}
	catch(Exception e){
		System.out.println(" Some error" +" " + e);
	}
	

	}
	public static void checkAge()  throws Exception{      // throws is used for functions unlike throw which is used to get exception in code
	
		System.out.println(18/0);
	}

}
