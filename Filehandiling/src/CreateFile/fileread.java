package CreateFile;


import java.io.FileReader;
import java.io.IOException;

public class fileread {
	
	public static void main(String[] args) {
		char[] data = new char[100];
		
		try {
			FileReader input = new FileReader("FileHandling.txt");
			input.read(data);
			System.out.println("File Data Read Successfully");
			System.out.println(data);
			input.close();
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}