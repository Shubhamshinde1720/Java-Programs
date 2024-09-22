import java.util.*;
class PrimeCheackNumber{

public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter a number to cheak prime or not");

int num=shub.nextInt();

for(int i=2; i<num; i++){
     if(num%i==0){
     System.out.println(num +" This is NOT PRIME NUMBER");
     }
     else{
     System.out.println(num+" This is PRIME NUMBER");
    }
}
}
}
