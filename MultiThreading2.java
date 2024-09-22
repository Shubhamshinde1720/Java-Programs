public class MultiThreading2 {

   public static void main(String[] args) {
      MyThread t=new MyThread();

      t.run();

      for(int j=0; j<5; j++){
         System.out.println("Main Thread");
         
      }
   }
   
}

class MyThread extends Thread{
   public void run(){
      for(int i=0; i<5; i++){
         System.out.println("MyThread Thread");
      }
   }
}
