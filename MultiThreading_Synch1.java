public class MultiThreading_Synch1 {
   public static void main(String[] args){
      Display d=new Display();
      Display d2=new Display();
      MyThread11 t11=new MyThread11(d,"Nikki");
      MyThread11 t12=new MyThread11(d,"shubh");

      t11.start();
      t12.start();
   }
 
}

class MyThread11 extends Thread{
   Display d;
   String name;

   MyThread11(Display d,String name){
      this.d=d;
      this.name=name;
   }

   public void run(){
      d.wish(name);
   }
   }

  
class Display{

     public synchronized void wish(String name){
      for(int i=0; i<100; i++){
         System.out.print("Good Morning :: ");

         try{
            Thread.sleep(100);
         }catch(InterruptedException ie){

         }
         System.out.println(name);
      }
   }

}
