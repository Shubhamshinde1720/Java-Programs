public class joinDemo {

   public static void main(String[] args) throws InterruptedException{
      VenueFixing vf=new VenueFixing();
      CardsPrint cp=new CardsPrint();
      CardsDistribution cd=new CardsDistribution();

      vf.start();
      vf.join();
      cp.start();
      cp.join();
      cd.start();
      cd.join();

   System.out.println("wedding is tommarow..");   
   }
   
}


class VenueFixing extends Thread{
   public void run(){
      System.out.println("Taj Hotel Mumbai...");
      
   }
}

class CardsPrint extends Thread{
   public void run(){
      System.out.println("cards printed");
      
   }
}

class CardsDistribution extends Thread{
   public void run(){
      System.out.println("Cards Distributed..");
   }
}