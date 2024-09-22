public class MultiThreading_SetPriority {
   public static void main(String[] args) {
      Thread7 t7=new Thread7();

     

      t7.setPriority(10);

      t7.start();

      for(int j=0; j<11; j++){
         System.out.println("main thread"+j);
      }

       System.out.println(Thread.currentThread().getName()+ Thread.currentThread().getPriority());
      System.out.println(t7.getName() + t7.getPriority());
   }

}

class Thread7 extends Thread{
   public void run(){
      for(int i=0; i<11; i++){
         System.out.println("child Thread"+i);
      }
   }
}
