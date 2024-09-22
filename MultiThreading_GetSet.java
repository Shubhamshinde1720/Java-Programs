public class MultiThreading_GetSet {
   public static void main(String[] args) {
      MT thread=new MT();

      System.out.println(thread.getName());

      System.out.println(Thread.currentThread().getName());

      thread.setName("nikki");
      Thread.currentThread().setName("shubh");

        System.out.println(thread.getName());

      System.out.println(Thread.currentThread().getName());

      System.out.println(19/0);


   
   }
}

class MT extends Thread{

}
