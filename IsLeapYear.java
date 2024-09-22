import java.util.Scanner;

public class IsLeapYear {


   public static void isLeapYear(int year){

      if(year%4==0){
         System.out.println("This is Leap Year "+year);
      }
      else{
         System.out.println("This is non-Leap year "+year);
      }
   }
   

   public static void main(String[] args) {
      try {
         Scanner shub = new Scanner(System.in);
         System.out.println("Please enter year to cheack it is leap or non-leap year");
         int year=shub.nextInt();

         isLeapYear(year);

         }catch(Exception e){
            System.out.println("Please handle Exception "+e);
         }
      }
   

}

