package MethodOverloading;

public class OverloadingWithInheritance {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.getLogin("Romil");
		e.getLogin();
		e.getLogin(20);
		
	}

}
class User{
	public void getLogin() {
		System.out.println("User Login");
	}
	
	public void getLogin(int name) {
		System.out.println( name+" "+ "people login");
	}
	
}

class Employee extends User{
	public void getLogin(String name) {
		System.out.println(name+" "+"Logins");
	}
	
}