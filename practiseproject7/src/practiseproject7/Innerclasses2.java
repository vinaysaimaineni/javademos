package practiseproject7;

public class Innerclasses2 {



private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	Innerclasses2  ob=new Innerclasses2 ();  
	ob.display();  
	}
}


abstract class AnonymousInnerClass {
	   public abstract void display();
	}