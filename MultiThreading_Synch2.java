public class MultiThreading_Synch2 {    
   
   public static void main(String[] args){

      //created two diffrent objects and run wish method with passing arguments object and name then synchronized not work because of two diffrent objects not work at method level lock 
      
      Display1 d1=new Display1();
      Display1 d2=new Display1();

      MyThread12 tt=new MyThread12(d1,"nikki");
      MyThread12 ttt=new MyThread12(d2,"Shubh");
      tt.start();
      ttt.start();

   }
}



class MyThread12 extends Thread{
   Display1 d;
   String name;

   MyThread12(Display1 d,String name){
      this.d=d;
      this.name=name;
   }

   public void run(){
      d.wish(name);
   }
   }

  
class Display1{

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




