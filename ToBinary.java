import java.util.*;

public class ToBinary{

public static void main(String[] args){

 Scanner x = new Scanner(System.in);
 System.out.print("Decimal Number : ");
 int num  = x.nextInt();
 System.out.println("Binary Number : " + tobinary(num));

      }


 static String tobinary(int n)
    {
       String x = "";
       int a;
      while(n > 0)
            {
              a = n % 2;     
              x = x + "" + a;
              n = n / 2;
            }
     return x;
    }

}
