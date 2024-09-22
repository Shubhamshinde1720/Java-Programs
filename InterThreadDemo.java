public class InterThreadDemo {
   public static void main(String[] args) throws InterruptedException {
      ThreadA a=new ThreadA();
     
      
      a.start();


      synchronized(a){
      a.wait();
     // Thread.sleep(0,1);
      System.out.println(a.total);

      }
   }
}



class ThreadA extends Thread{
   
   int total =0; 

   
  public void run(){

   synchronized(this){
     for(int i=1; i<1000; i++)
     {
           total+=i;
     }
   }

   this.notify();
}
}