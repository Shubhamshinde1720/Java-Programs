import java.util.*;
class CheackPrime{

public static void main(String args[]){

Scanner shub=new Scanner(System.in);
int a=shub.nextInt();
CheackPrime cc=new CheackPrime();
cc.cheackprime(a);

}

public void cheackprime(int a){
for(int i=2; i<a; i++){
  if(a%i==0)
  System.out.println(" This is not prime Number :"+a); 
  }

 System.out.println("This is Prime Number :"+a);}
}