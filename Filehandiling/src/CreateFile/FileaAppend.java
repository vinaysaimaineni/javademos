package CreateFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileaAppend {
	public static void main(String[] args) {
		
		String data = "This data is appended";
		
		try {
			FileWriter output = new FileWriter("FileHandling.txt", true);
			output.write(data);
			System.out.println("Data Appended Successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("Data not successfully");
			e.printStackTrace();
		}
	}

}