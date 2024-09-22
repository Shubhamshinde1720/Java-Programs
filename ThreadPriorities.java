public class ThreadPriorities {
   public static void main(String[] args) {
      int x=Thread.currentThread().getPriority();

      System.out.println(Thread.currentThread().getName()+" "+x);
      int max=Thread.MAX_PRIORITY;
      int min=Thread.MIN_PRIORITY;
      int norm=Thread.NORM_PRIORITY;

      System.out.println("max priority of thread = "+max);
      System.out.println("min priority of thread = "+min);
      System.out.println("norm priority of thread = "+norm);
   }
}
