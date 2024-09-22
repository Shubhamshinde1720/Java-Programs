public class StaticInstatanceControl {

   {
      System.out.println("first instatnce block");
   }
   

   static{
      System.out.println("first static block");
   }

   StaticInstatanceControl(){
      System.out.println("constructorr.....");
   }

   public static void main(String[] args) {
      StaticInstatanceControl obj1=new StaticInstatanceControl();
      System.out.println("main method loaded");

      StaticInstatanceControl obj2=new StaticInstatanceControl();


   }

   static{
      System.out.println("second static block");
   }

   {
      System.out.println("second instance block");
   }
}
