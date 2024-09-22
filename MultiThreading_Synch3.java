public class MultiThreading_Synch3 {
   public static void main(String[] args) {

      Displaync dobj=new Displaync();

      MyThread13 t13=new MyThread13(dobj);
      MyThread14 t14=new MyThread14(dobj);

      t13.start();
      t14.start();

   }

}



class Displaync{

   public synchronized void displayn(){
      for(int i=0; i<11; i++){
         System.out.println("\t"+i);

         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){

         }
      }
   }


   public synchronized void displayc(){
      for(int i=65; i<76; i++){
         System.out.println((char)(i));

         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){

         }
      }
   }
}


class MyThread13 extends Thread{
  Displaync dnc1;

  MyThread13(Displaync dnc1){
   this.dnc1=dnc1;
  }
  

  public void run(){
   dnc1.displayn();
  }

}

class MyThread14 extends Thread{
   Displaync dnc2;

   MyThread14(Displaync dnc2){
      this.dnc2=dnc2;
   }

   public void run(){
      dnc2.displayc();
   }
}