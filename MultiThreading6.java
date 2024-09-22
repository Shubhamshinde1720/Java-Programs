public class MultiThreading6 {
   public static void main(String[] args) {
      Thread6 t6=new Thread6();
      
      t6.start();
      Object sout;
      System.out.println("main Thread");
   }
}

class Thread6 extends Thread{
   public void start(){
      super.start();
      System.out.println("Overriding start method after super.start() ");
   }

   public void run(){
      System.out.println("Thread6 thread");
   }
}
