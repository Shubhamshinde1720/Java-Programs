import java.util.*;
class PrimeNonPrime{

public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter a number");
int num=shub.nextInt();
boolean flag=true;

for(int i=2; i<num; i++){
  if(num%i==0){
   flag=false;
}
}
   if(flag==true){
 System.out.println(num+ " is a Prime number");
}else{
System.out.println(num +"  is a nonprime numbear ");
}
}
}