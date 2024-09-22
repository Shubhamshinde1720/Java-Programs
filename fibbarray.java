import java.util.*;
class FibboArray{
    public static void main(String args[]){
Scanner shub=new Scanner(System.in);
        try{
            int n,i; 
        System.out.println("please enter the length of fibbonacchi series");
        n=shub.nextInt();
        int fibb[]=new int[n];
        fibb[0]=0;
        fibb[1]=1;

        for(i=2; i<n; i++){

            fibb[i]=fibb[i-1]+fibb[i-2];

        }

        for(i=0; i<n; i++){
            System.out.println(" "+fibb[i]);
        }
        }

        catch(Exception e){
            System.out.println("!!! PLEASE RESOLVE THE EXCEPTION  \n"+e);
        }
    }
}