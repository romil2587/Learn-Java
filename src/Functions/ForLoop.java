package Functions;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter outter loop");
	int outter = sc.nextInt();
	
	System.out.println("Enter inner loop");
	int inner = sc.nextInt();
	
	sc.close();	
		for(int i=1;i<=outter;i++)
		{
			for(int j=1;j<=inner;j++)
			{
				System.out.println(j);
			}
		}

	}

}
