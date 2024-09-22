 class Display {
   

   public synchronized void  wish(String name){
      for(int k=0; k<10; k++){
         System.out.print("Good Morning : ");

         try{
         Thread.sleep(1000);
         }catch(InterruptedException ie){
            System.out.println(ie);
         }
         System.out.println(name);
      }
   }

   // public static void main(String[] args) {
   //    Display d=new Display();
   //    d.wish("dhoni");
   // }
}

class MyThread8 extends Thread{
   Display d;
   String name;

   MyThread8(Display d, String name){
      this.d=d;
      this.name=name;
   }

   public void run(){
      d.wish(name);
   }
}


public class SynchronizedDemo {

   public static void main(String[] args) {
      Display d=new Display();
      MyThread8 t1=new MyThread8(d,"kohli");
      MyThread8 t2=new MyThread8(d, "dhoni");
      MyThread8 t3=new MyThread8(d, "raina");
      MyThread8 t4=new MyThread8(d, "abd");


      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
   
}