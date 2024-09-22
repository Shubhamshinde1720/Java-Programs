import java.util.*;
class ExceptionAssignment{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);

       
       try{ System.out.println("Please enter values of a and b");
        int a=shub.nextInt();
        int b=shub.nextInt();
        int sum=a/b;
        System.out.println("sum= "+sum);
       }
       catch(ArithmeticException ae){
        System.out.println("please enter b is nonzero number ");
       }   
       catch(ArrayIndexOutOfBoundsException aiobe){
        System.out.println("array index out of bound exception");


       }catch(NumberFormatException nfe){
        System.out.println("Please enter only numbers"
        );
       }
       catch(InputMismatchException ime){
        System.out.println("InputMismatchException");
       }
    }
}