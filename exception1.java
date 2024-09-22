import java.util.Scanner;
class Exception1{
public static void main(String args[]){

int a=10, b;
Scanner s=new Scanner(System.in);
System.out.println("Please enter the value");
try{
b= s.nextInt();

int ans=a/b;
System.out.println("answer is printed in try block \n   ans="+ans);
}
catch(Exception e){
System.out.println("This statement in the catch block and exception occurs::"+e);
}
finally{
System.out.println("..Hello from finally  method");
}
}
}