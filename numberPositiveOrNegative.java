import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Declaración de variables e inicialización.
		int numberA;
        
        try 
        {
	       Scanner numeroInput = new Scanner(System.in);  // Create a Scanner object
	    
	       System.out.println("Dime un número cualquiera");
	       numberA = numeroInput.nextInt();
	    
	       if (numberA < 0)
	       {
	            System.out.println("El número introducido es negativo."); 
	       }
	       else
	       {
	            System.out.println("El número introducido es positivo."); 
	       }
            
        }
        catch (Exception e)
        {
            
        }
    }
}
