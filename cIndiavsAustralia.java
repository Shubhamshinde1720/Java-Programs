import java.util.Scanner;

class IndiavsAustralia{
  

    public static void main(String[] args){
      try{
      Scanner shub=new Scanner(System.in);

      System.out.println("Please enter the class of ticket betweent1-3");
      int classnum=shub.nextInt();

      if(classnum ==1){
         System.out.println("You choose the class-1 ticket please pay 5000rs");
      }else if(classnum==2){
         System.out.println("You choose the class 2 seat please pay 2000rs");
      } else if(classnum==3){
         System.out.println("You choose class 3 seat please pay 1000rs");

      }else{
         System.out.println("Please cheak the input number is less or greater than required");
      }
   }catch(Exception e){
      System.out.println("Exception occours please handle "+e);
   }






    
   }
}