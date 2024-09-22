
public class Thread1 {
   public static void main(String[] args) {
      MyThread t=new MyThread();
      t.run();

      for(int i=0; i<10; i++){
         System.out.println("Main Thread");
      }
      
   }
}


class MyThread extends Thread{
   public void run(){
      for(int k=0; k<10; k++){
         System.out.println("Child Thread");
      }
   }
}
