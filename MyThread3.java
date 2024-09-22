public class MyThread3 {

   public static void main(String[] args) {
      RunnableThread rt=new RunnableThread();
      Thread t=new Thread(rt);
      // rt.start();
      // rt.run();
      t.start();
      // t.run();
      System.out.println(t.getName());
   }
   
}
