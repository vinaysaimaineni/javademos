package practiseproject19;



public class Diamond<First> implements First,Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 
}