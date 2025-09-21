package OOPS;

public class ThisKeyword {

	public static void main(String[] args) {
	Persons p1 = new Persons();	
	Persons p2 = new Persons("Romil Singhtwadia");
	}

}

class Persons{
	String name= "Romil Singhtwadia";
	Persons(){
		this.getData();
		System.out.println(this.name);
	}
	
	Persons(String name){
		this();     // in it 
	}
	
	public void getData() {
		System.out.println(this.name);
	}	
}
