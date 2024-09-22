import java.util.*;
class LucasSeries{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        int n,a,b,c,d;
        n=shub.nextInt();
        a=1;
        b=1;
        c=1;

        System.out.println(" "+a+" "+b+" "+c);
        for(int i=1; i<=(n-3); i++){
            d=a+b+c;

            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }
    }
}