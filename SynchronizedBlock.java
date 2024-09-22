public class SynchronizedBlock {
   public static void main(String[] args) {
      Display d=new Display();
      MyThread12 t12=new MyThread12(d, "DHONI");
      MyThread12 t13=new MyThread12(d, "YUVRAJ");

      t12.start();
      t13.start();
   }
}


class Display{
   public void wish(String name){
     ;;;;// 1 lakh lines of code
    synchronized (this){ 
      for(int i=0; i<10; i++){
         System.out.print("Good Morninig : ");
         try{
            Thread.sleep(500);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
         System.out.println(name);
      }
   }

   ;;;;;// another 1 lakh lines of code
   }
}

class MyThread12 extends Thread{
   Display d;
   String name;

   MyThread12(Display d, String name){

      this.d=d;
      this.name=name;
   }

   public void run(){
      d.wish(name);
   }
}
