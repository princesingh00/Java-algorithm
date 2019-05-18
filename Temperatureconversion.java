import java.util.*;
import java.io.*;

public class Temperatureconversion { 
 
public static void main(String[] args)
   {    
        Temperatureconversion obj = new Temperatureconversion();
	Scanner x = new Scanner(System.in);	 
 	System.out.println("Which conversion do you want?");           
        System.out.println("1.Celsius to Fahrenheit");                             
 	System.out.println("2.Fahrenheit to celsius");    
        int ch = x.nextInt();   
    
    switch (ch)
      {

        case 1: System.out.println("Enter temperature in celsius :");  
		int a = x.nextInt(); 
		System.out.println("Temperature in Fahrenheit : " + obj.temp_conversion1(a));
              break;        	
        case 2: System.out.println("Enter temperature in Fahrenheit :");
		int b = x.nextInt(); 
		System.out.println("Temperature in Celsius : " + obj.temp_conversion2(b));
              break;    
        default : System.out.println("Something went wrong");
              break;
    }

   }	
         static double temp_conversion1(float c)
  		 {
   			double fahrenheit = c * 9/5 + 32;
		        return fahrenheit;
    			}   

	 static double temp_conversion2(float f)
 		  {
  		          double celsius = (f - 32) * 5/9;
			  return celsius;
   			 }   




}

