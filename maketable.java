import java.util.*;
class MakeTable{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.print("please enter any number for creating table:: ");
        int table=shub.nextInt();
        int i=1;

        while(i<=10){
            System.out.println(table+" x "+i+" = "+table*i);
            i++;
        }
    }
}