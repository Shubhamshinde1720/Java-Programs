public class MultiThreading5 {
   public static void main(String[] args){
      Thread5 t5=new Thread5();

      t5.start();
      System.out.println("main Thread");
   }

}

class Thread5 extends Thread{
   public void start(){
      System.out.println("Overriding start method ");
   }

   public void run(){
      System.out.println("Thread5 Thread Started");
   }
}
