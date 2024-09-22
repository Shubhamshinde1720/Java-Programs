
import java.util.Scanner;
public class Capgemini2 {
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);

      int n=shub.nextInt();
      int x=shub.nextInt();
      int y=shub.nextInt();

      int count=0;

      while(n-->0){
         int l=shub.nextInt();
         int r=shub.nextInt();

         for(int i=x;i<=y;i++){
            for(int j=l;j<=r;j++){
               if(i==j){
                  count++;
               }
            }
         }
      }

      System.out.print(count);
   }
}
