public class SynchronizedDemo3 {

   public static void main(String[] args) {
      Display d=new Display();
      Display d2=new Display();

      MyThread11 t11=new MyThread11(d);
      MyThread11 t12=new MyThread11(d2);


      t11.start();
      t12.start();
   }
   
}


class Display {
   public static synchronized void show(){
      for(int i=0; i<10; i++){
         System.out.println("show by  "+Thread.currentThread().getName()+" - "+i);

         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
      }
   }
}

class MyThread11 extends Thread{
   Display d;

   MyThread11(Display d){
      this.d=d;
   }

   public void run(){
      d.show();
   }
}
