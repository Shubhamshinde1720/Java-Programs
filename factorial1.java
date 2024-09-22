import java.util.*;
class Factorial1{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("enter any number to find factorial");
        long n =shub.nextLong();
        long fact=1;

        for(long i=n; i>=1; i--){
            fact=fact*i;

        }
        System.out.println("factorial of "+n+ " is :: "+fact);
            }
}