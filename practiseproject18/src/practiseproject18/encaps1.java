package practiseproject18;

public class encaps1 
{     
    public static void main (String[] args)  
    { 
        encaps obj = new encaps(); 
        obj.setName("sai"); 
        obj.setAge(21); 
        obj.setRoll(55); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 
}