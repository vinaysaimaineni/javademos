package CreateFile;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		
		File myfile = new File("FileHandling.txt");
		
		try {
			if (myfile.createNewFile()) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File Not Created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}