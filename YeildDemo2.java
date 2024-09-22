public class YeildDemo2 {

   public static void main(String[] args) throws InterruptedException{
      MyThread8 t8=new MyThread8();

      MyThread8.mt=Thread.currentThread();
      t8.start();

      for(int k=0; k<10; k++){
         System.out.println("main thread..");
         Thread.sleep(2000);
      }
   }
   
}

class MyThread8 extends Thread{
   public static Thread mt;

   public void run() {
      try{
         mt.join(6000);

      }catch(InterruptedException ie){
         System.out.println(ie);
      }

      for(int i=0; i<10; i++){
         System.out.println("child thread");
      }
   }
}
