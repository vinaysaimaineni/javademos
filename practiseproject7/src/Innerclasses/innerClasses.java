package Innerclasses;

public class innerClasses {

	 private String msg="Welcome to my world"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", start work");}  
	 }  


	public static void main(String[] args) {

		innerClasses obj=new innerClasses();
		innerClasses.Inner in=obj.new Inner();  
		in.hello();  
	}
}
