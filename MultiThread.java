
public class MultiThread {
   public static void main(String[] args) {
      Thread1 t1=new Thread1();
      Thread2 t2=new Thread2();
      Thread3 t3=new Thread3();

      t1.start();
      t2.start();
      t3.start();
   }

}

class Thread1 extends Thread
{
   public void run(){
      for(int i=0; i<5; i++){
      System.out.println("Thread 1 starts "+i);
   }
}
}

class Thread2 extends Thread{
   public void run(){
      for(int j=0; j<5; j++){
               System.out.println("Thread 2 starts "+j);

      }
   }
}

class Thread3 extends Thread{
   public void run(){
      for(int k=0; k<5; k++){
               System.out.println("Thread 3 starts "+k);

      }
   }
}
