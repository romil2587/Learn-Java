package OOPSTypes;

public class HierarchyInheritance {

	public static void main(String[] args) {
		
A a = new A();
B b = new B();
a.print_alpha();
a.print_A();
b.print_alpha();
b.print_B();

	}

}

class Alphabet{
	public void print_alpha() {
		System.out.println("This is an alphabet");
	}
}

class A extends Alphabet{
	public void print_A() {
		System.out.println("This is A");
	}

	
}

class B extends Alphabet{
	public void print_B() {
		System.out.println("This is B");
	}
}


