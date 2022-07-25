package practiseproject8;

public class Strings1 {

}
public static void main(String[] args) 
{ 
    String str1 = "Hello!"; 
    StrConcat(str1); 
    System.out.println("final String is - " + str1); 

    StringBuffer str2 = new StringBuffer("Hello!"); 
    StrBufConcat(str2); 
    System.out.println("final String is - " + str2); 

    StringBuilder str3 = new StringBuilder(" Hello!"); 
    StrBuildConcat(str3);
    System.out.println("final String is -" + str3); 
} 
}