public class MultiThreading_Yeild {
   public static void main(String[] args) {
      
      YieldThread yt=new YieldThread();
      yt.start();

      for(int j=0; j<11; j++){
         System.out.println("main thread"+j);
      }
   }


}

class YieldThread extends Thread{
   public void run(){
      for(int i=0; i<11; i++){
         System.out.println("child thread "+i);
         Thread.yield();
      }
   }
}
