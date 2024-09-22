public class MultiThreading_By_DurgaApproch {
   public static void main(String[] args){
      DurgaThread dt=new DurgaThread();
      Thread t=new Thread(dt);

      t.start();

      System.out.println("main Thread");


      System.out.println(Thread.currentThread().getName());
      System.out.println(t.getName());
      System.out.println(dt.getName());

   }

}


class DurgaThread extends Thread{
   public void run(){
      System.out.println("child Thread");
   }
}
