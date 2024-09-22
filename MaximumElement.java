import java.util.Scanner;

public class MaximumElement{
   
 public static void main(String[] args) {
   Scanner shub=new Scanner(System.in);

   System.out.println("enter the value of num");
   int num=shub.nextInt();
   int[] arr=new int[num];

   for(int i=0; i<num; i++){
      
     System.out.println("the value of arr element "+i);
      arr[i]=shub.nextInt();
   }


   int result=muximumElementInArray(arr,num);
   System.out.println("The maximum element in the array is:: "+result);

 }

 public static int muximumElementInArray(int[]  array, int num){

   if(array==null || array.length == 0){
      throw new IllegalArgumentException("This is for array is empty");
   }
   int maxElement=array[0];

   for(int element : array){
      if(element >maxElement){
         maxElement=element;
      }
   }

   return maxElement;


 }

      
}
