package com.bridgeit.algorithm;

import java.util.Arrays;

public class Palindrome {

	static int[] prime()
	{
		System.out.println("Prime numbers in between 1 to 1000 ");
		int i =0;
		int num = 0;
		int[] primenumber = new int[500];
		for(num = 2; num<1000; num++ )
		{   int counter = 0;
		for(int j = 1; j <= num; j++ )
		{
			if(num%j == 0)
			{
				counter = counter+1;
			}
		}

		if(counter < 3)
		{ 
			primenumber[i] = num;
			i++;
		}

		}

		for(int k = 0; primenumber[k]!=0; k++ )
		{
						System.out.print(primenumber[k] + " ");
		}
		return primenumber;
	}
	static int[] anagram(int[] prime )
	{
		int[] anagram = new int[1000];
		int c =0;
		System.out.println();
		System.out.println();
		System.out.println("Anagram prime numbers are as follow");

		for(int j = 0; j< prime.length; j++)
		{
			for(int k = j+1; k < prime.length; k++)
			{
				String str1 = Integer.toString(j);
				String str2 = Integer.toString(k);

				char a1[] = str1.toCharArray();
				char a2[] = str2.toCharArray();

				Arrays.sort(a1);
				Arrays.sort(a2);

				if(Arrays.equals(a1, a2))
				{
					anagram[c]=j;
					c++;
					anagram[c]=k;
					c++;
				}
			}
		}	
		for(int j = 0; j < anagram.length; j++) {
			System.out.print(anagram[j] + " ");
		}
		return anagram; 
	}

	static void palindrome(int[] prime)
	{
		int[] palin = new int[500];
		int index = 0;
		String str2="";
		int x[]=prime;
		for(int i=0;i<x.length;i++){

			int no =x[i];
			String str1 = Integer.toString(no);
			str2="";
			for(int j=str1.length()-1;j>=0;j--){        
				str2+=str1.charAt(j);
			}

			if(str1.equals(str2)){
				palin[index++]=x[i];
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("Palindrome prime numbers as follow");
		for(int k=0;palin[k]!=0;k++) {
			System.out.print(palin[k] + " ");
		}

	}


	public static void main(String args[])
	{
		int[] number = prime();
		anagram(number);
		palindrome(number);
	}
}
