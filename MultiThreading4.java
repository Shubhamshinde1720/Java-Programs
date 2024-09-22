public class MultiThreading4 {
   public static void main(String[] args){
      Thread4 t4=new Thread4();

      t4.start();

      System.out.println("NO OUTPUT BECAUSE OF WE ARE NOT OVERRIDING RUN METHOD IN THREAD4 AND THAT REASON THREAD CLASS RUN METHOD CALLED WHICH HAS EMPTY IMPLEMENTATION ");
   }

}

class Thread4 extends Thread{


}