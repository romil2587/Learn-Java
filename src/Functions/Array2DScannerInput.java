package Functions;

import java.util.Scanner;

public class Array2DScannerInput {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter rows in 2D array");
int row = sc.nextInt();
System.out.println("Enter columns in 2D array");
int column = sc.nextInt();
String str[][] = new String[row][column];
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++){
	System.out.println("Enter value in 2D array");
	str[i][j]=sc.next();
	sc.close();
	}
}


for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++){

System.out.println(str[i][j]);}

	}
}


	}

