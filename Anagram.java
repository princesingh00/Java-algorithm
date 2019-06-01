package com.bridgeit.algorithm;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class Anagram {
	public static void main(String args[]) 
	{ 
		System.out.print("Enter First String : ");
		String str1 = Utility.getString();
		str1 = str1.replaceAll("\\s","");

		System.out.print("Enter second String :");
		String str2 = Utility.getString();
		str2 = str2.replaceAll("\\s","");

		int n1 = str1.length();
		int n2 = str2.length(); 

		char[] l = str1.toCharArray();
		char[] r = str2.toCharArray();

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

	
