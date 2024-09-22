public class SynchronizedDemo2 {
   
   public static void main(String[] args) {
      Display d=new Display();

      MyThread9 t9=new MyThread9(d);
      MyThread10 t10=new MyThread10(d);


      t9.start();
      t10.start();
   }
}



class Display{
   public synchronized void displayn(){
      for(int i=0; i<10; i++){
         System.out.print(i);
         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
      }
   }


   /**
    * 
    */
   public synchronized void displayc(){
      for(int i=65; i<75; i++){
         System.out.print((char)i);
      try{
         Thread.sleep(500);
      }catch(InterruptedException ie){

         System.out.println(ie);
      }
   }


   }
}


class MyThread9 extends Thread{
   Display d;


   MyThread9(Display d){
      this.d=d;
   }

   public void run(){
      d.displayn();
   }
}


class MyThread10 extends Thread{
   Display d;


   MyThread10(Display d){
      this.d=d;
   }

   public void run(){
      d.displayc();
   }
}
