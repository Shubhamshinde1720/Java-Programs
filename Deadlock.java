public class Deadlock extends Thread{
   A a=new A();
   B b=new B();
   public void m1(){
      this.start();
      a.d1(b);
      
   }

   public void run(){
      b.d2(a);
   }
   public static void main(String[] args) {
     Deadlock d=new Deadlock();
     d.m1();
   }
}


class A{
   public synchronized void d1(B b)
   {
      System.out.println("d1() start execution");

      try{
         Thread.sleep(5000);
      }catch(InterruptedException ie){
         System.out.println(ie);
      }
          

      System.out.println("waiting for b lock");
      b.last();
   }

   public synchronized void last(){
      System.out.println("inside A this is last() method");
   }
}

class B{
   public synchronized void d2(A a)
   {
      System.out.println("d2() start its execution");

      try
      {
         Thread.sleep(5000);
      }catch(InterruptedException ie)
      {
         System.out.println(ie);
      }

      System.out.println("waiting for a lock");
      a.last();
   }

   public synchronized void last()
   {
      System.out.println("inside B this is last() method");
   }
}
