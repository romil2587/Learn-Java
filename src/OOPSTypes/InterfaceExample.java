package OOPSTypes;

public class InterfaceExample {

	public static void main(String[] args) {
	Car c1 = new Car();
	System.out.println(c1.car);
	c1.startengine();
	c1.applybreak();
	c1.gearchanged();

	}

}

interface driving{
	String car = "any car";
	public void startengine();
	public void applybreak();
		
	}

class Car implements driving{
	String car = "i10";
	public void startengine() {
		System.out.println("Engine Started");
	}
	public void applybreak() {
		System.out.println("Break Applied");
	}
	
	public void gearchanged() {                             // this is a addition method that interface doesnt have
		System.out.println("Gear Changed");
	}
}
