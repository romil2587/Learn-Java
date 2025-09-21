package FileOperations;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
try {
	File file = new File("Read.txt");
	Scanner reader = new Scanner(file);
	while(reader.hasNextLine()) {
		System.out.println(reader.nextLine());
	}
		}catch(Exception e) {
			System.out.println("Some error"+ " "+ e);
		}
		
		
		

	}

}
