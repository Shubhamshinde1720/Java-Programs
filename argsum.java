import java.util.*;
class ArgSum{
    public static void main(String args[]){
        int sum=0;
        int len=args.length;

        for(int i=0; i<len; i++){
            int x = Integer.parseInt( args[i] );
            sum=sum+x;
        }
        System.out.println("sum of command line arguments:: "+sum);
    }
}