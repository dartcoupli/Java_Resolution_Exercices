import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Declaración de variables e inicialización.
        double valueDiameter;
        double valueLong;
        
        
        try 
        {   
            System.out.println("Dime el radio de una círcunferencia: ");
            Scanner scannerRatioCircle = new Scanner(System.in);  // Create a Scanner object
	        int inputRatioCircle = scannerRatioCircle.nextInt();
        
            valueDiameter = inputRatioCircle*2;
            
            valueLong = Math.PI*valueDiameter;
            
            System.out.println(valueLong);
        }
        catch (Exception e)
        {
            
        }
    }
}
