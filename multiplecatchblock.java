import java.util.*;
class MultipleCatchBlock{


public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter the value of a");
int a =shub.nextInt();
System.out.println("Please enter the value of b");
int b=shub.nextInt();


try{
//int a,b;
//a=Integer.parseInt(args[0]);
//b=Integer.parseInt(args[1]);


if((a==0) || (b==0))
throw new ArithmeticException();
if((a<=0) || (b==0))
throw new Exception();

System.out.println("It is try block statement ");

}

catch(ArithmeticException ae){
System.out.println("arthmatic exception please enter greater than zero");
}

catch(InputMismatchException inme){
System.out.println("Number format exception please enter valid numbers only");
}

catch(ArrayIndexOutOfBoundsException aiobe){
System.out.println("Array index out of bound exception please enter valid array");
}

catch(Exception e){
System.out.println("Exception occurs please handle it");
}

finally{
System.out.println("THIS IS FROM FINALLY METHOD");
}

}
}