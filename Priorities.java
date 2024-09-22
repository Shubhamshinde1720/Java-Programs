
/**
 * InnerPriorities
 */
 class MyThread6 extends Thread {
   public void run(){
      for(int i=0; i<10; i++){
         System.out.println("child thread");
      }
   }

   
}
public class Priorities {
   public static void main(String[] args){
      MyThread6 t6=new MyThread6();

      t6.setPriority(10);
      t6.start();

      for(int i=0; i<10; i++){
         System.out.println("main thread");
      }

      System.out.println(t6.getPriority());
      System.out.println(Thread.currentThread().getPriority());
   }
}
