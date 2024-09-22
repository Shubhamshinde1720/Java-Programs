import java.util.Scanner;
class Integer{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n=shub.nextInt();

        if(n>0){
            System.out.println("N is positive integer : "+n);

        }else
        System.out.println("N is negative integer : "+n);
    }
}