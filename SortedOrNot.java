import java.util.Scanner;
class SortedOrNot{
      
 public static void main(String[] args) 
  {
         Scanner shubh=new Scanner(System.in);
         System.out.println("Please enter the size of array do you want");
         int num=shubh.nextInt();


         int[] arr=new int[num];

          for(int i=0; i<num; i++){
          arr[i]=shubh.nextInt();
      }

      System.out.println("The elements of array are:: ");
         for(int j=0; j<arr.length; j++){
         System.out.print(arr[j]+" ");
         }

         SortedOrNot obj=new SortedOrNot();
         System.out.println("Is this array is sorted? ");
         System.out.println(arraySortedOrNot(arr, num));
         

   }

     
  
      public static boolean arraySortedOrNot(int array[],int num){
         for(int i=0; i<num-1; i++){

         if(array[i]<array[i+1])
            return true;
      }
      
            return false;
      }


   }
   


  
