package Basics;

import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.nextLine();
	
	System.out.println("Enter your age");
	int age = sc.nextInt();

	System.out.println("Enter your sal");
	Float sal = sc.nextFloat();
	sc.close();

	
	System.out.println("Your name is:"+" "+name);
	System.out.println("Your age is:"+" "+age);
	System.out.println("Your salary is:"+" "+sal);
	}

}
