package MethodOverloading;

public class FinalKeyword_Variable {

	public static void main(String[] args) {
		User_child u1 = new User_child();
		System.out.println(u1.name);
		System.out.println(u1.getName());
	}
}

class User_parent{
	String name = "Pinku";
 }
 
class User_child extends User_parent{
	
/* final */ String name = "Romil";
	 
	public String getName() {
	this.name="Govinda";
	return name;
	}
	}
	
