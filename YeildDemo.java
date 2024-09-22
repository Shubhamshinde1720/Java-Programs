public class YeildDemo {
   public static void main(String[] args) throws InterruptedException{
      MyThread7 t7=new MyThread7();
      t7.start();
      t7.join();
   
      
      for(int i=0; i<10; i++){
         System.out.println("main thread");
         
      }

   }
}

class MyThread7 extends Thread{
   public void run(){
      for(int i=0; i<10; i++){
         System.out.println("child thread");
         try{
            Thread.sleep(2000);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
      
      }
   }

}
