package OOPSTypes;

public class HybridInheritance {

	public static void main(String[] args) {
		Beta s = new Beta();
		s.print_dadi();
		s.print_dada();
		s.father1();
		s.mother1();
		s.sons();

	}
}
	
interface dadi{
public void print_dadi();

}	

interface dada{
public void print_dada();


}


class Baap implements dadi, dada{
	public void father1() {
		System.out.println("This is father");
	}
	
	public void print_dadi() {
		System.out.println("This is grandmother");
	}
	
	public void print_dada() {
		System.out.println("This is grandfather");
	}
}

class Ma extends Baap{
	public void mother1() {
		System.out.println("This is mother");
	}
}

class Beta extends Ma{
	public void sons() {
		System.out.println("This is son");
	}
}


