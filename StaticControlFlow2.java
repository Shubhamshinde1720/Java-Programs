public class StaticControlFlow2 {
   
   static int i=90;

   static {
      m1();
      System.out.println("base static block");
   }

   public static void main(String[] args) {
      m1();
      System.out.println("base main method");
   }

   public static void m1(){
      System.out.println(j);
   }
   static int j=80;
}

class Child extends StaticControlFlow2{
   static int x=99;

   static{
      m2();
      System.out.println("child static first block");
   }
    
   public static void main(String[] args) {
      m2();
      System.out.println("child main method ");
   }

   public static void m2(){
      System.out.println(y);
   }

   static{
      System.out.println("child 2nd static block");
   }

   static int y=88;




}
