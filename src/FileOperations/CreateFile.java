package FileOperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File myFile = new File("CreateFile.txt");
		 if(myFile.createNewFile()==true)
{
	 		 System.out.println("File has been created");
			 
	}
		 else {
			 
			 System.out.println("File already exist");
		 }
		

	}

}
