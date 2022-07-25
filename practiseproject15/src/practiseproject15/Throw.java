package practiseproject15;

public class Throw
{
    public static void main(String[] args)
    {

        int a=55,b=9,result;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                result = a / b;
                System.out.print("\n\tThe result is : " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }
}
