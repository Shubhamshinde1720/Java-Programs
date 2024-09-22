public class MyThread4 {

   public static void main(String[] args) {
      GetSetThread t=new GetSetThread();
      Thread t1=new Thread(t);
      t.start();


      System.out.println(Thread.currentThread().getName());
      System.out.println(t.getName());
      Thread.currentThread().setName("pawan kalyan");
      System.out.println(Thread.currentThread().getName());


      System.out.println("The main method executed by "+Thread.currentThread().getName());

      // System.out.println(10/0);
   }
}