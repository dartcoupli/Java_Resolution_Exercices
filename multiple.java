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
	    
	       numberA = numeroInput.nextInt();
           numberB = numeroInput.nextInt();
        
           if (numberA % numberB == 0 || numberB % numberA == 0)
           {
                System.out.println("Son multiplos");
           }
           else
           {
               System.out.println("No son multiplos");
           }
        }
        catch (Exception e)
        {
            
        }
    }
}
