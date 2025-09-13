package Functions;

import java.util.Scanner;

public class ArraywithScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers in array");
		int number = sc.nextInt();
		int marks[] = new int[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter marks");
			marks[i]= sc.nextInt();
			System.out.println(marks[i]);
		}
		
		for(int j=0;j<number;j++)
		{
			System.out.println(marks[j]);
		}
		
		
		
		

	}

}
