
import java.util.Scanner;
public class PP{
    public static void main(String[] args){
        Scanner shubh=new Scanner(System.in);
        System.out.println("How many starts do you want to print please enter");
        int num=shubh.nextInt();
        
        for(int i=1; i<=num; i++){
            
            for(int j=num; j>=i; j--){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
}

