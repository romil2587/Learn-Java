package MethodOverloading;

public class SuperKeyword {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.dosomething();

	}

}

class Animal{
	Animal(){
		System.out.println("Constructor called");
	}
	int age = 5;
	public void sleeping() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal{
	Dog(){
		super();                                   // Constructor of parent class is used in constructor of child class
	}
public void dosomething() {                       // super Keyword is used to call the functions/variable/constructor of parent class in child class
	super.sleeping();
	System.out.println(super.age);
}
}