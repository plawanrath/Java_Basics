import java.util.*;
public class EvaluateTemperature {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter C for celcius or F for Farenhiet");
        char measure = sc.next().charAt(0);
        if(measure != 'C' && measure != 'F')
        {
        	System.out.println("Invalid entry!!");
        	System.exit(0);
        }
        else if(measure == 'C')
        {
        	temperature = (1.8*temperature)+32;
        }
    	if(temperature < 0)
    		System.out.println("Extremely cold");
    	else if(temperature >= 0 && temperature <= 32)
    		System.out.println("Very cold");
    	else if(temperature >= 33 && temperature <= 50)
    		System.out.println("Cold");
    	else if(temperature >=51 && temperature <= 70)
    		System.out.println("Mild");
    	else if(temperature >= 71 && temperature <= 90)
    		System.out.println("Warm");
    	else if(temperature >=91 && temperature <= 100)
    		System.out.println("Hot");
    	else
    		System.out.print("Very hot");
	}
}
