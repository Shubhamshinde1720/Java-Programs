public class DataHiding {

   private double balance;

   public double getBalance(double balance){
      return balance;
   }

   
}

class A extends DataHiding{
   public static void main(String[] args) {
      A a=new A();
     System.out.println( a.getBalance(33));
   }
}
