
import java.util.Scanner;

public class arthematiccaluclator {
	public static void main(String[] args) {
		char operator;
		Double num1,num2;
		Double result=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operator(+,-,*,/,%):");
		operator=sc.next().charAt(0);
		
		System.out.println("Enter Two Numbers:");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		
		if(operator == '+') {
			
			result=num1+num2;
		}else if(operator=='-') {
			result=num1-num2;
		}else if(operator=='*') {
			result=num1*num2;
		}else if(operator=='/') {
			result=num1/num2;
		}else if(operator=='%') {
			result=num1%num2;
		}else {
			System.out.println("Invalid operator!");
		}
		System.out.println("Answer is:"+result);
		
	}
	
	
	
}
