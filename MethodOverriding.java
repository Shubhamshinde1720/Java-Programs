

public class MethodOverriding{

   public static void k1(){
      System.out.println("gold, cash, money");
   }

   public static int k1(int a,int b){
      return a*b;
   }

   public static void main(String[] args){
      MethodOverriding.k1();
      Childd.k1();

      System.out.println(MethodOverriding.k1(2,4));
      System.out.println(Childd.k1(2,4));



      //k1();
   }
}

class Childd{
   public static void k1(){
      System.out.println("bonds, stocks, land");
   }

   public static int k1(int a,int b){
      return a+b;
   }
}