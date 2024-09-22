import java.util.*;
class PerfectNumber{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        int i,n,sum;

        n=shub.nextInt();
        sum=0;

        for(i=1; i<=n/2; i++){
            if(n % i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("\n The Number "+n+" is Perfect number");
        }else{
            System.out.println("\n The Number "+n+" is not perfect number");
        }
    }
}