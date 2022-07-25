package CreateFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		String data = "Welcome to my world, Have a nice day";
		
		try {
			FileWriter output = new FileWriter("FileHandling.txt");
			output.write(data);
			System.out.println("Data written successfully in text file");
			output.close();
		} catch (IOException e) {
			System.out.println("data not written in text file");
			e.printStackTrace();
		}
	}
}