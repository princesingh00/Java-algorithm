import java.util.*;
import java.io.*;
import java.lang.Math;

public class newton{

 public static void main(String[] args)
      {
	Scanner x = new Scanner(System.in);
 	System.out.println("POSITIVE NUMBER FOR SQUAREROOT");
 	int num = x.nextInt();

 	System.out.println("SQUAREROOT : " + sqrt(num));

	}

public static double sqrt(int c)
 {  
    double t = c;
    double epsilon = 1e-15;  

    while(Math.abs(t - c/t) > epsilon*t){

                       t = (c/t + t) / 2;

                         }  
        return t;
 }

		}
