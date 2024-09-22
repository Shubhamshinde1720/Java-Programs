import java.util.*;
class PrimeNonPrime{

public static void main(String args[]){
Scanner shub=new Scanner(System.in);
int num=shub.nextInt();
boolean flag=true;

for(int i=2; i<num; i++){
  if(num%i==0){
   flag=false;
}
}
   if(flag==true){
 System.out.println("Number is Prime");
}else{
System.out.println("Number is nonprime");
}
}
}