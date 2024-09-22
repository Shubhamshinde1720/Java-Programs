public class StaticInstanceControl {

   {
      System.out.println("first instatnce block");
   }
   

   static{
      System.out.println("first static block");
   }

   StaticInstanceControl(){
      System.out.println("constructorr.....");
   }

   public static void main(String[] args) {
      StaticInstanceControl obj1=new StaticInstanceControl();
      System.out.println("main method loaded");

      //StaticInstanceControl obj2=new StaticInstanceControl();


   }

   static{
      System.out.println("second static block");
   }

   {
      System.out.println("second instance block");
   }
}
