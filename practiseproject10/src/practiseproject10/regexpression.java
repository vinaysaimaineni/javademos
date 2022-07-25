package practiseproject10;


import java.util.regex.Pattern;


public class regexpression {

	public static void main(String args[])
	{

		String text = "Welcome to  my world";


		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(
			delimiter, Pattern.CASE_INSENSITIVE);

		String[] result = pattern.split(text);

		for (String temp : result)
			System.out.println(temp);
	}
}
