public class MultiThreading_By_Runnable {
   public static void main(String[] args){
      MyRunnable r=new MyRunnable();
      Thread t=new Thread(r);
      t.start();

      for(int i=0; i<999; i++){
         System.out.println("I = "+i);
      }


   }
}

class MyRunnable implements Runnable{
   public void run(){
      for(int j=0; j<999; j++){
         System.out.println("j = "+j);
      }
   }
}
