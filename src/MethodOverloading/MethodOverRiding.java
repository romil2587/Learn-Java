package MethodOverloading;

public class MethodOverRiding {

	public static void main(String[] args) {
	Child c1 = new Child();
	c1.getLogin();
	c1.getLogout();

	}

}
class Parent{
	public void getLogin() {
		System.out.println("Parent Login");
	}
	
	public void getLogout() {
		System.out.println("Logout");
	}
}

class Child extends Parent{
	public void getLogin() {
		System.out.println("Child Login");
	}
}