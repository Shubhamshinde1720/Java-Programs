import java.util.*;
class MaxNumberDigit{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("Please enter any number");
        int num=shub.nextInt();
        int temp=0;

        while(num>0){
            int r=num%10;
            num=num/10;

            if(temp<r){
                temp=r;
            }
        }

        System.out.println("Maximum digit in number is :: "+temp);
    }
}