import java.util.Scanner;

public class LinearSearch {
   

   public static void main(String[] args){

      int[] arr= {2,5,7,7,23,5,67,25,9};
      int len=arr.length;
     Scanner shub=new Scanner(System.in);
     System.out.println("Please enter the value of number that find in array...");

     int num=shub.nextInt();

      System.out.println("The number "+num +" have in array is =   "+searchElement(arr, len, num));

   }
      public static boolean searchElement(int[] arr, int len, int target){
      for(int i=0; i<len; i++){
         if(arr[i]==target){
            return true;
         }
      }

      return false;


   }

}
