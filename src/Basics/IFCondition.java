package Basics;

public class IFCondition {

	public static void main(String[] args) {
		int age =38;
		String name = "Romil";
		if (age == 38 && name == "Romil")
		{
			System.out.println("You are correct");
		}
		else if(age == 39 && name == "Romil") 
		{
			System.out.println("Your age is wrong");
		}
		else if(age == 38 && name == "Sam") 
		{
			System.out.println("Your name is wrong");
		}
		else 
		{
			System.out.println("Try Again");
		}
	}

}
