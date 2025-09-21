package OOPSTypes;

public class Inheritance {

	public static void main(String[] args) {
Child ch = new Child();
ch.getData();
ch.getData("This is child Function");
// ch.getData1(); This is wrong because getData1() is a private function.
System.out.println(ch.name);
	}

}
class Parent{
	String name = "Romil Singhtwadia";
	
	public void getData() {
		System.out.println("You get data from this.");
	}
	
	private void getData1() {
		System.out.println("You will not get data from this.");
	}
}
 class Child extends Parent {
	  
	 public void getData(String data) {
		 System.out.println(data);
	 }
 }