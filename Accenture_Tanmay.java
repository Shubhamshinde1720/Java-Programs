import java.util.Arrays;
import java.util.Scanner;
public class Accenture_Tanmay {


   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);

      int[] arr={1,5,3,2,6,4,8,7};


      Arrays.sort(arr);


      int start=0;
      int end=arr.length-1;

     

      while(start<end){
         System.out.print(arr[end]+" "+arr[start]+" ");
         start++;
         end--;
      }


      if(arr.length%2!=0)
         System.out.print(arr[arr.length/2]);

   
   }

   
}
