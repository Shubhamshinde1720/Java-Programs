public class MultiThreading_join2 {
   public static void main(String[] args) throws InterruptedException {
      

   Thread8.mainthread=Thread.currentThread();
   Thread8 t8=new Thread8();

   t8.start();

   //t8.join();  Deadlock situation

   for(int i=0; i<11; i++){
      System.out.println("main thread-"+i);
      Thread.sleep(1000);
   }

   System.out.println("name of child thread mainthread is "+Thread.currentThread().getName());
   System.out.println("name of t8 thread is "+t8.getName());

   }
}

class Thread8 extends Thread{
   static Thread mainthread;

   public void run(){
      System.out.println(mainthread.getName());
      
         try {
            mainthread.join();
         } catch (InterruptedException e) {
          for(int j=0; j<9; j++){
            System.out.println("child thread-"+j);
         }
         }
       
      }
}

