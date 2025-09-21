package FileOperations;

import java.io.FileWriter;

public class CreateAndWriteFile {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("CreateAndWriteFile.txt");
		fw.write("Creating and writing in file");
		fw.close();
		}catch(Exception e) {
			System.out.println("Some error"+ " "+ e);
		}
	}

}
