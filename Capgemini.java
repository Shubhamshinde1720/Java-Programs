
import java.util.Scanner;
public class Capgemini1 {
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);

      int n=shub.nextInt();
      int count=0;
      int sum=0;

      for(int i=1;i<=1000;i++){

         sum+=i;
         count++;

         if(sum==n){
            System.out.print(count);
            break;
         }else if(sum>n){
            System.out.print(count-1);
            break;
         }
         }
      }


}
   



