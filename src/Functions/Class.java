package Functions;
public class Class {
	public static void main(String[] args) {
		User u1 = new User();
		u1.getData();
		System.out.println(u1.age);
		getData1();
		Class2 c1 = new Class2();
		c1.rs();
		String Teacher_Name = "Teacher";
		u1.tName(Teacher_Name);
		
	}
	public static void getData1()
	{System.out.println("Print2");
	}
}
class Class2{
public void rs() {
		User u2 = new User();
		u2.getData();
		int age = u2.age;
		System.out.println(age);
		System.out.println(u2.name);
	}
}
class User{
	int age = 38;
	String name = "Romil Singhtwadia";
	public void getData()
	{System.out.println("Print");
	}	
	public void tName(String Name)
	{		System.out.println(Name);
	}
}