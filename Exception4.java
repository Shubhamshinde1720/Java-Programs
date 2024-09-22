public class Exception4 {
   public static void main(String[] args){
      try{
         System.out.println(10/0);
      }catch(ArithmeticException ae){
         
         System.out.println("handle arithmetic exception by arithmetic exception ");
      }
      catch(Exception e){
         System.out.println("handle exception by exception class");
      }
   }
}
