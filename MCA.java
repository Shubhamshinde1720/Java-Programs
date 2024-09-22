import java.util.Scanner;
public class MCA{
      static  Scanner shub=new Scanner(System.in);

  
   public static void main(String[] args){
      
    try{  MCA obj=new MCA();
            System.out.println("MCA Student Please enter you name");

      String name=shub.nextLine();
      sandhya_Mam_Asking(name);
    }catch(Exception e){
      System.out.println("Exception occours please handle it "+e);
    }


   }


   
      public static void sandhya_Mam_Asking( String name){

      
     // System.out.println("SANDHYA MAM ASKING :: What is you name ");

      
      System.out.println("SANDHYA MAM:: "+name+" How many days you are going to the OCLF function tell me");

      System.out.println(name+" please enter no. of days you are going in OCLF ");
      int days_of_oclf=shub.nextInt();


      if(days_of_oclf==0){

         System.out.println("SANDHYA MAM:: "+name+" Tumhari Practicle exam gayi Ghar wapas jao tum ");

      }
      else if (days_of_oclf==1) {
         System.out.println("SANDHYA Mam:: "+name+" Beta tum kaha gaye the 1 din theek hai aage se aisa nahi karna ");
         
      }else if (days_of_oclf==2) {
         System.out.println("YOGESH SIR :: jo bhi dono din OCLF aaye the unko to mai pura benifit dilwaunga meri taraf se...");
         
      }else{
         System.out.println("SORRY PLEASE ENTER OCLF NO OF DAYS 0,1 OR 2");
      }
      
   }
   }

   



