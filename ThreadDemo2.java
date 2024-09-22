public class ThreadDemo2 {
   

   public static void main(String[] args){
      MyThread2 t2=new MyThread2();


      t2.run();
      t2.run(2);
      System.out.println("main Thread");
      t2.start();
   }
}
