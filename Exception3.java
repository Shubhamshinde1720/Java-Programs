/**
 * Exception3
 */
public class Exception3 {

   public static void main(String[] args)
   {
      try{
         System.out.println("statement 1");
      System.out.println(10/0);
      System.out.println("statement 3");
      }catch(ArithmeticException ae){
        System.out.println(10/2);
       ae.printStackTrace();
       System.out.println(ae);
       System.out.println(ae.toString());
        System.out.println(ae.getMessage());
      }
      System.out.println("ending of try-catch block");
   }
   
}