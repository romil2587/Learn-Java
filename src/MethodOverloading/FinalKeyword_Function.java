package MethodOverloading;

public class FinalKeyword_Function {

	public static void main(String[] args) {

Method_child m1 = new Method_child();
m1.getName();
	}

}

class Method_parent{
	/* final */ public void getName() {
		System.out.println("This is parent method");
	}
}
class Method_child extends Method_parent{
	public void getName() {
		System.out.println("This is child method");
	}
}