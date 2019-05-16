import java.util.*;
import java.io.*;

public class binary{

public static void main(String[] args)
{

 Scanner x =new Scanner(System.in);
 System.out.println("Enter the size of array : ");
 int n = x.nextInt();
 System.out.println("Enter the elements of array : ");
 int[] arr = new int[n];

	for(int i =0; i<n; i++)
	{ 
  	  arr[i] = x.nextInt();
	}
      System.out.println("Enter the search element : ");
      int key  = x.nextInt();

         Arrays.sort(arr);

         binary obj = new binary();
         int value = obj.sorting( arr, 0, n-1, key );
         
	if(value == -1)
	System.out.println("element not found"+ value);
        	else
	System.out.println("index : "+ value);   
}
   

                int sorting(int arr[],int l, int r, int searchkey)
                   {		 
			   if(r>=l)
			      {
				int mid = l+(r-l)/2;

				 if(arr[mid] == searchkey)
				 return mid;
				
				 if(arr[mid]>searchkey)
                                     return sorting(arr,l,mid-1,searchkey);

				 return sorting(arr,l,mid+1,searchkey);
 
         			}
                          return -1;

                   }
}



					
