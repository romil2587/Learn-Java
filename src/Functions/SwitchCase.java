package Functions;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.close();
		switch (age){
		case 10:
			System.out.println("Your age is 10");
			break;
		case 20:
			System.out.println("Your age is 20");
			break;
		case 30:
			System.out.println("Your age is 30");
			break;
		case 40:
			System.out.println("Your age is 40");
			break;
		case 50:
			System.out.println("Your age is 50");
			break;
		case 60:
			System.out.println("Your age is 60");
			break;
		default:
			System.out.println("You are a senior citizen");
		}

	}

}
