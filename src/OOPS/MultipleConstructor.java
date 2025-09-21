package OOPS;

public class MultipleConstructor {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("This is a parameterized constructor");
		Person p3 = new Person("Romil",38);

	}

}

class Person{
	Person(){
	System.out.println("This is a default constructor");	
	}
	
	Person(String message){
		System.out.println(message);
	}
	
	Person(String name,int age){
		System.out.println(name+" "+age);
	}
}