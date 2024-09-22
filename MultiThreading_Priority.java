public class MultiThreading_Priority {
    public static void main(String[] args) {
      
      System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());

      //Thread.currentThread().setPriority(9);

      System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());

      Thread t=new Thread();

      System.out.println(t.getName()+t.getPriority());
      System.out.println(t.getId());
      

    }
}
