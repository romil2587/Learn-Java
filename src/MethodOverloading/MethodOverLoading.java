package MethodOverloading;

public class MethodOverLoading {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.getData();
		e1.getData("Romil");
		e1.getData("Romil", "Singhtwadia");
		e1.getAge(38);
		e1.getAge("Thirty Eight");
		

	}

}
class Emp{
	
	public void getData() {
		System.out.println("Method without parameter");
	}
	public void getData(String name) {
		System.out.println(name);
	}
	public void getData(String fname, String lname) {
		System.out.println(fname+" "+lname);
	}
	
	public void getAge(int age) {
		System.out.println("Your Age in number"+" "+age);
	}
	
	public void getAge(String age) {
		System.out.println("Your Age in words"+" "+age);
	}
	
	
}