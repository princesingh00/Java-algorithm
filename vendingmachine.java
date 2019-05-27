import java.util.*;
import java.lang.*;
public class vendingmachine
{

public static void main(String[] args)
{  
   
   int[] notes = new int[] { 1000,500,100,50,10,5,2,1};
    int[] noteCounter = new int[8];
   System.out.println("Enter the amount : ");
   Scanner x = new Scanner(System.in);
   int amount  = x.nextInt();

   
       for (int i = 0; i < 8; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = amount / notes[i]; 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       
       
        System.out.println("Currency Count : "); 

        for (int i = 0; i < 8; i++) { 
            if (noteCounter[i] != 0) { 
                System.out.println(notes[i] + " : " + noteCounter[i]); 
            } 
       }

      }



}
