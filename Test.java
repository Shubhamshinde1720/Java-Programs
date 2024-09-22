public class Test {
   public static void main(String[] args) {
      myT obj=new myT();
      obj.start();

      System.out.println(Thread.currentThread().getName());
      Thread.currentThread().setName("Nikki");
      System.out.println(Thread.currentThread().getName());
      
      System.out.println("main Thread");
     // System.out.println(10/0);
   }

}


class myT extends Thread{
   public void run(){
      System.out.println("run thread");
      System.out.println(Thread.currentThread().getName());
      Thread.currentThread().setName("Shubh");
      System.out.println(Thread.currentThread().getName());
   }
}