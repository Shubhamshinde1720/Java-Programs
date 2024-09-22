import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicle5 {
   

   public static void main(String[] args) {
      Scanner shub=new Scanner(System.in);

   
   try{
      System.out.println("Please enter the value of num1");
    int num1=shub.nextInt();

    System.out.println("Please enter the value of num2");
    int num2=shub.nextInt();

    int division = num1/num2;
    System.out.println(division);

   }catch(ArithmeticException ae){
      System.out.println("Arithmetic Exception occours handle it"+ae);
   }
   catch(NumberFormatException ne){
      System.out.println("Number Format Exception occours please handle it"+ne);
   }catch(InputMismatchException ime){
      System.out.println("Input Mismatch Exception occours please handle it "+ime);
   }
   catch(Exception e){
      System.out.println("Exception occours please handle it"+e);
   }


    
       
   }
}
