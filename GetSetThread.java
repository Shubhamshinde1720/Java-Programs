class GetSetThread extends Thread {

   public void run(){

      Thread.currentThread().setName("nagu");
      System.out.println("The run() method executed by "+Thread.currentThread().getName());
   }
   
}


