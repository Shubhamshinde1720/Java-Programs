import java.util.*;
class OddEvenSum{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("please enter value of n to add odd and even numbers sum from 0 to num");
        int num=shub.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=0; i<=num; i++){
            if(i%2==0){
                evensum=evensum+i;

            }else{
                oddsum=oddsum+i;

            }

            
        }
            System.out.println("even sum from 0 to num is :: "+ evensum);
            System.out.println("odd sum from 0 to num is :: 0"+ oddsum);
    }
}