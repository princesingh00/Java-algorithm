package com.bridgeit.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int getInteger() {
		int integer = scanner.nextInt();
		return integer;
	}
	public static String getString() {
		String string = scanner.next();
		return string;
}
	public static double getDouble() {
		double Double = scanner.nextDouble();
		return Double;
}
	public static double temp_conversion1(double c)
		 {
	    double fahrenheit = c * 9/5 + 32;
	    return fahrenheit;
	}   
    public static double temp_conversion2(double f)
	  {
		 double celsius = (f - 32) * 5/9;
		 return celsius;
} 
    public static double Payment(double p,double r,double year)
    {     
   	    double n =12*year; 
		double r1 = r/(12*100);
		double pay = (p*r1)/(1-Math.pow(1+r1,-n));
	    return pay;
	}
	public static boolean getBoolean() {
		boolean bool = scanner.nextBoolean();
		return bool;
	}   
   	static int[] BubbleSort(int[] array, int len)
	{  
		int temp = 0;
		for(int i=0; i<len-1 ;i++){ 
			for(int j= 0; j<len-i-1; j++){
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
				}
			}
		}  
		return array;
}
	static int[] insertion(int[] array, int len)
	{  
		int j = 0;
		for(int i=0; i<len ;i++){ 
			int key =array[i];
			j = i-1;
			while(j>=0  && array[j]>key){
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
		return array;
	}
	public static int BinarySort(int arr[],int l, int r, int searchkey)

	{		 
		if(r>=l)
		{
			int mid = l+(r-l)/2;
			if(arr[mid] == searchkey)
				return mid;
			if(arr[mid]>searchkey)
				return BinarySort(arr,l,mid-1,searchkey);
			return BinarySort(arr,l,mid+1,searchkey);
		}
		return -1;
	}
	public static String[] StringBubbleSort(String[] array, int len)
	{  
		String temp = null;
		for(int i=0; i<len-1 ;i++){ 
			for(int j= 0; j<len-i-1; j++){
				if(array[j].compareTo(array[j+1])>0)
				{
					temp = array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
				}
			}
		}  for(int j= 0; j<len; j++){
			System.out.println(array[j]);
		}
		System.out.println();
		return array;
	}
	public static String[] StringInsertion(String inputArray[])
{  
	String key;
	int i,j;
	for (j = 1; j < inputArray.length; j++) { 
	   key = inputArray[j];
	    i = j - 1;
	    while (i >= 0) {
	      if (key.compareTo(inputArray[i]) > 0) {
	        break;
	      }
	      inputArray[i + 1] = inputArray[i];
	      i--;
	    }
	    inputArray[i + 1] = key;
	    //System.out.println(Arrays.toString(inputArray));
	  }
	  System.out.println(Arrays.toString(inputArray));
	  return inputArray;
	}
	
	public static String reverse(String string)
	{
		char[] arr1 = string.toCharArray();
		int len = arr1.length;
		char[] arr2 = new char[len];
		int j = 0;
		String str =" ";
		
		for(int i = arr1.length -1; i>=0 ; i--)
		{
		  arr2[j] = arr1[i];
			j++;
		}
		
		for(int i=0; i<len ;i++)
		{
		 str = str + arr2[i];
		}

		return str;
	}
	

public static void main(String args[])
{
	String str0 = "123";
	String str = reverse(str0);
	System.out.println(str);
}}
