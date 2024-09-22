import java.util.*;
class StarPattern2{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        int num,i,j;
System.out.println("please enter the number for printing patter reversly");
        num=shub.nextInt();
//j=shub.nextInt();
        

        for(i=0; i<num; i++){

            for( j=i; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}