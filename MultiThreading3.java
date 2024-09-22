public class MultiThreading3 {
   
   public static void main(String[] args) {
      Thread3 t=new Thread3();

      t.start();

      for(int j=0; j<6; j++){
      System.out.println("main method");
   }
}
}


class Thread3 extends Thread{

   public void run(){
      for(int i=0; i<6; i++){
      System.out.println("no arg run()");
   }
}

   public void run(int i){
      System.out.println("args run() ");
   }
}
