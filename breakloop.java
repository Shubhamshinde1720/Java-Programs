import java.util.*;
class BreakLoop{
    public static void main(String args[]){
        
Scanner shub=new Scanner(System.in);
        System.out.println("please enter the value of n");
        int num=shub.nextInt();

        for(int i=1; i<num; i++){
            System.out.println(i);

            if(i==55){
                break;
            }
        }
        System.out.println("break at number 55");
    }
}