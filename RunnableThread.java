import java.lang.Runnable;
public class RunnableThread implements Runnable{

   public void run(){
      for(int i=0; i<19; i++){
         System.out.println("Thread = "+i);
      }
   }

  
}
