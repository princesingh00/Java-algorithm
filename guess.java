import java.util.*;
import java.io.*;
import java.lang.Math;

public class guess{

public static int search(int lo, int hi) {
        if ((hi - lo) == 1) 
        return lo;

        int mid = lo + (hi - lo) / 2;

        System.out.println("Is your number less than : " + mid);
        Scanner x = new Scanner(System.in);
        boolean a = x.nextBoolean();

        if (a == true) 
        return search(lo, mid);
        else                     
        return search(mid, hi);
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int n = (int) Math.pow(2, k);
        System.out.println("Think of an integer between  0," + (n-1));
        int secret = search(0, n);
        System.out.println("Your number is " + secret);
 
 }
}

