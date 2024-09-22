public class MyThread2 extends Thread{

   public void run(){
      System.out.println("child Thread");
   }

   public void run(int i){
      System.out.println("method overload..");
   }

   public void start(){
      System.out.println("This is start method");
   }
   
}
