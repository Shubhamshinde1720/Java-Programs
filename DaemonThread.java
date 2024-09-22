public class DaemonThread {
   public static void main(String[] args) {
      MyThread t=new MyThread();

     System.out.println(Thread.currentThread().isDaemon());
     //Thread.currentThread().setDaemon(true);
     System.out.println();


     System.out.println(t.isDaemon());
     t.setDaemon(true);
     System.out.println(t.isDaemon());
   }
}

class MyThread extends Thread{

}
