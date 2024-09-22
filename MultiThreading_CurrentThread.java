public class MultiThreading_CurrentThread {
   public static void main(String[] args)
   {
      CThread tobj=new CThread();

      tobj.start();

      System.out.println(Thread.currentThread().getName());
   }
   

}


class CThread extends Thread{
   public void run(){
      System.out.println(Thread.currentThread().getName());
   }
}
