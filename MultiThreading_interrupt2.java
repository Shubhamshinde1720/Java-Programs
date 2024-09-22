public class MultiThreading_interrupt2 {

   public static void main(String[] args) {
      Thread11 t11=new Thread11();
      t11.start();

     // t11.interrupt();

     System.out.println("main thread end");

   }
   
}

class Thread11 extends Thread{
   public void run(){
      for(int i=0; i<11111; i++){
         System.out.println("i am lazy thread "+i);
      }
      System.out.println("i am going to sleep");
      try{
         Thread.sleep(5000);
      }catch(InterruptedException ie){
         System.out.println("i got interrupted ");
      }
   }
}
