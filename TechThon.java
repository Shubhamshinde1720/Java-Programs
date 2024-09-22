

import java.util.Scanner;

public class TechThon{
    public static void main(String[] args) {
      Scanner shub=new Scanner(System.in);

      System.out.println("Enter size of array");
      int size1=shub.nextINnt();
      System.out.println("Enter next size of array");
      int size2 = shub.nextInt();


      int[][] arr=new int[size1][size2];


      for(int i=0; i<size1; i++ ){
         for(int j=0; j<size2; j++){
            arr[i][j]=shub.nextInt();
         }
      }

      // System.out.print("arr =  ");

      for(int[] i : arr){
         for(int k : i){
            System.out.print(k+" ");
         }


         System.out.println();
      }


      System.out.println("Swap four numbers without using extra variables or methods...");

      System.out.println("Enter value of a, b, c , d");

      
      int a=shub.nextInt();
      int b=shub.nextInt();
      int c=shub.nextInt();
      int d=shub.nextInt();

      System.out.println("Befor swapping the variables values are = ");
      System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);

      a=a+b;
      b=a-b;
      a=a-b;

      c=c+d;
      d=c-d;
      c=c-d;

      a=a+c;
      c=a-c;
      a=a-c;


      System.out.println();
      System.out.println("After swapping the variables values are = ");

      
      System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);



      
   }
}