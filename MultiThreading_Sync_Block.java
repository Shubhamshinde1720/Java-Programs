public class MultiThreading_Sync_Block {
   public static void main(String[] args) {
      Wish w=new Wish();

      MyThread15 t15=new MyThread15(w, "dhoni");
      MyThread15 t16=new MyThread15(w, "kohli");
      t15.start();
      t16.start();
   }
   

}

class Wish{
   public void wish(String name){
         // 1lakh line of code......

         synchronized(this){
            for(int i=0; i<11; i++){
               System.out.print("Good Morning :: ");

               try {
                  Thread.sleep(1000);
               } catch (Exception e) {
                  // TODO: handle exception
               }

               System.out.println(name);
            }
            // 1lakh line of code.....
         }
   }
}

class MyThread15 extends Thread{
   Wish w;
   String name;

  MyThread15(Wish w,String name){
      this.w=w;
      this.name=name;

   }

   public void run(){
      w.wish(name);
   }
}
