public class MultiThreading_Interrupt {
   public static void main(String[] args) {
      Thread10 t10=new Thread10();
      t10.start();

      t10.interrupt();
      System.out.println("main thread ");

   }
}

class Thread10 extends Thread{
   public void run(){
      try{
         for(int i=0; i<22; i++){
            System.out.println("child thread before sleeping ");
            Thread.sleep(5000);
         }
      }catch(InterruptedException ie){
         System.out.println("i got interrupted by interrupt() ");
      }
   }
}
