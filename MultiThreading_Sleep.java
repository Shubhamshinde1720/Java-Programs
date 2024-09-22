public class MultiThreading_Sleep {
  public static void main(String[] args) throws InterruptedException {
   
   for(int i=0; i<11; i++){
      System.out.println("slide - "+i);
      Thread.sleep(2000);
      
   }
  }   

}


