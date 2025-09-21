package OOPSTypes;

public class SingleInheritance {

	public static void main(String[] args) {

		Main_child c1 = new Main_child();
		c1.getData();
		System.out.println(c1.name);
	}
}
class Main_parent{
	String name = "Romil Singhtwadia";
	public void getData() {
		System.out.println("From here you will get data");
	}
}

class Main_child extends Main_parent{
	
}


