/**
 * MultiThreading_join
 */
public class MultiThreading_join {
   public static void main(String[] args) throws InterruptedException{
      JoinThread jt=new JoinThread();

      jt.start();
      jt.join();
     // jt.join(5000);
     // jt.join(2000,999);

      for(int j=0; j<11; j++){
         System.out.println("rama thread"+j);
        // Thread.sleep();
      }
   }

   


}

class JoinThread extends Thread{
   public void run(){
      for(int i=0; i<11; i++){
         System.out.println("seeta thread "+i);

         try{
            Thread.sleep(2000);
         }catch(InterruptedException ie){
            System.out.println("I got interrupted please handle it ");
         }
      }
   }
}