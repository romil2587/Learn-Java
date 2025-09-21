package MethodOverloading;

public class Throw {

	public static void main(String[] args) {
	try {
		System.out.println(10/2);
		int a =10;
		if(a==10)
		{
			System.out.println("Hello");
		}
		throw new Exception("test");     // throw is used for code.means to put the code forcefully in catch block 
	}
catch(Exception e) {
	System.out.println("some error" +" "+ e);
}
	}

}
