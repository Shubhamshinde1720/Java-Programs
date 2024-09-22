import java.io.*;
import java.util.*;


class ExceptionThrows1{

public void AgeLimit(int age) throws ArithmeticException{
  if(age<18) {
  System.out.println("You cant vote");
   throw new ArithmeticException();
  
}
  else{
  System.out.println("You are eligible fir vote");
 }
}


public static void main(String args[]){
Scanner shubh=new Scanner(System.in);
int age=shubh.nextInt();

ExceptionThrows obj=new ExceptionThrows();
obj.AgeLimit(19);
}
}
  