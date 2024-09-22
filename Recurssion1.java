import java.util.Scanner;

public class Recurssion1{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      int n=shub.nextInt();

      untilPrint(n);

   }


  static void untilPrint(int n){
      if(n==1){
         System.out.print("");
      }else

         untilPrint(n-1);
         System.out.print(n+" ");
      
   }
}