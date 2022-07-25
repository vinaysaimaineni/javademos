package practiseproject14;

public class tryandwatch 
{
    public static void main(String args[]) 
    {
        int[] array = new int[6];
        try 
        {
            array[9] = 6;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}
