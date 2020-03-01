import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Declaración de variables e inicialización.
		int numberA;
        int numberB;
        
        try 
        {
	       Scanner numeroInput = new Scanner(System.in);  // Create a Scanner object
	        
	       System.out.println("Dime el primer número: ");
	       numberA = numeroInput.nextInt();
	       System.out.println("Dime el segundo número: ");
           numberB = numeroInput.nextInt();
        
           if (numberA < numberB)
           {
                System.out.println(numberB + " es el número mayor");
           }
           else
           {
               System.out.println(numberA + " es el número mayor");
           }
        }
        catch (Exception e)
        {
            
        }
    }
}
