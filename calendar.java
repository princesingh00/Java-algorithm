import java.util.*;
import java.io.*;

public class calendar { 
 
public static void main(String[] args)
   {

	Scanner x =new Scanner(System.in);	 
 	System.out.println("Enter the Month in Number");           
        System.out.println("1.january");                              
 	System.out.println("2.february");           
 	System.out.println("3.march");           
 	System.out.println("4.April"); 
 	System.out.println("5.May");           
 	System.out.println("6.June");                               
 	System.out.println("7.July");           
 	System.out.println("8.August");           
 	System.out.println("9.September"); 
 	System.out.println("10.October");            
 	System.out.println("11.November");           
 	System.out.println("12.December");  
        int m = x.nextInt();   
    
 	System.out.println("Enter the Day in Number");           
        int d = x.nextInt();  

        System.out.println("Enter the Year");        
        int y = x.nextInt();  


     	int year = (y-(14-m)/12);
        int z  = (year + (year/4) - (year/100) + (year/400));
        int month = m + 12*((14-m)/12) - 2;
        int day = (d + z + (31*month)/12) % 7;

       int ch = day;
    switch (ch)
      {

        case 0: System.out.println("Sunday");     break;        	
        case 1: System.out.println("Monday");     break;    
        case 2: System.out.println("Tuesday");    break;           
        case 3: System.out.println("Wednesday");  break;             
        case 4: System.out.println("Thursday");   break;         
        case 5: System.out.println("Friday");     break;        
        case 6: System.out.println("Saturday");   break;    
        default : System.out.println("Something went wrong");

    }
}}


