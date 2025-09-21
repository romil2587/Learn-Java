package OOPSTypes;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Myself romil = new Myself();
		romil.Property();
		romil.Property1();
		romil.Property2();
	}

}

class GrandFather{
	String name = "Hazarilalji";
	public void Property() {
		System.out.println("He was my grand father");
	}
}

class Father extends GrandFather{
	public void Property1() {
		System.out.println("He is my father");
	} 
}

class Myself extends Father{
	public void Property2() {
		System.out.println("This is me");
	} 
}