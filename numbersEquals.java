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
	    
	        System.out.println("Dime un número");
	       numberA = numeroInput.nextInt();
	    
	        System.out.println("Dime otro número");
	       numberB = numeroInput.nextInt();
	       
	       if (numberA == numberB)
	       {
	          System.out.println("Son iguales"); 
	       }
	       else
	       {
	           System.out.println("No son iguales"); 
	       }
	       
            
        }
        catch (Exception e)
        {
            
        }
    }
}
