import java.util.*;
class StarPattern1{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("please enter value of num");
        int num=shub.nextInt();
        int i,j;

        for(i=0; i<num; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}