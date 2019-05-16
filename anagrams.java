import java.io.*; 
import java.util.Arrays; 
import java.util.Collections;
import java.util.Scanner;

public class anagram{

 public static void main(String args[]) 
    { 
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First String");
        String str1 = obj.nextLine();

        System.out.println("Enter second String");
        String str2 = obj.nextLine(); 

         int n1 = str1.length();
	int n2 = str2.length(); 

	char[] l = str1.toCharArray();
	char[] r = str1.toCharArray();

	if(n1!=n2){
	 System.out.println("Given strings are not anagrams");
	}

	else{
	
	  Arrays.sort(l); 
           Arrays.sort(r); 
          

                 if(Arrays.equals(l,r)) { 
                 System.out.println("Given strings are anagrams");
                 } 
		else {
                  System.out.println("Given strings are not anagrams");
                 }

 }
		
	         
	

}
}
