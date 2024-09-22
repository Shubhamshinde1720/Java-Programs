import java.util.*;
class SumOfN{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("Please any number to print sum from 1 to that number");
        int num=shub.nextInt();

        int a=1;

        while(a<=num){
            System.out.print(a+" ");
            a++;
        }

        int b=1;
        int sum=0;

        while(b<=num){
            sum=sum+b;
            b++;
        }

        System.out.println("\n Sum of 1 to "+num+" is :: "+sum);
    }
}