import java.util.*;
class Factorial{

public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter any number to find factorial ");
int a=shub.nextInt();
System.out.println("Factorial of "+a+ " is :"+ factorial(a));
}

public static int factorial(int num){
  if(num==1){
  return 1;
}else {
 return num*factorial(num-1);
}
}
}


