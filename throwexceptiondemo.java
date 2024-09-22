import java.util.*;
class ThorwExceptiondemo{
public static void main(String args[]){

int a,b;
Scanner shub=new Scanner(System.in);
System.out.println("please enter the value of a: ");
a=shub.nextInt();
System.out.println("Please enter the value of b: ");
b=shub.nextInt();



try{

if((a<=0) || (b<=0)){
  throw new ArithmeticException();
}
  int ans =a/b;
  System.out.println("answer is :"+ ans);
}

catch(Exception e){
System.out.println("The number is +ve integer and nonzero"+e);
}
}
}
