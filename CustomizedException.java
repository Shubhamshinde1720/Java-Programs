import java.util.*;
public class CustomizedException  {


   public static void main(String[] args){
      try{
         Scanner shub = new Scanner(System.in);
      System.out.println("Please Enter you age ");
      int age=shub.nextInt();


      if(age>=60) {
         throw new TooOldException("You are too young Please wait some more time ");
      }else if(age<=18){
         throw new TooYoungException("Aree! you are too old for marry");
      }else 
      System.out.println("Congratulation you are age is valid for marrige ");
      }catch(Exception e){
         System.out.println("plase handle the exception "+e);
      }
      
   }

   
   
}




class TooYoungException extends RuntimeException{
   TooYoungException(String s){
      super(s);
   }
}

class TooOldException extends RuntimeException{
   TooOldException(String str){
      super(str);
   }
}
