import java.util.*;
class ExceptionThrow{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Please enter value of a ");

int a=s.nextInt();
System.out.println("Please enter value of b ");
int b=s.nextInt();

try{
  int division=a/b;
  if(b==0){
  throw new ArithmeticException();
}
  else{
System.out.println("answer: "+division);}
}
catch(Exception e){
System.out.println("it is cant divide by zero "+e);
}

}}