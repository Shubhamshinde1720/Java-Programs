public class DeamonThread2 {
   public static void main(String[] args) {
      MyThread13 t13=new MyThread13();

      System.out.println("main is ended");
      t13.setDaemon(true);
      t13.start();
   }
}

class MyThread13 extends Thread{
   public void run(){
      for(int i=0; i<10; i++){
         System.out.println("child thread -" +i);

         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
      }
   }
}
