public class YeildDemo3 {

   public static void main(String[] args) {
      VenueFixing vf=new VenueFixing();
      CardsPrint cp=new CardsPrint();
      CardsDistribution cd=new CardsDistribution();

      vf.start();;
      cp.start();
      cd.start();
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