public class Singleton {
   private static Singleton s=new Singleton();

   private Singleton(){

   }

   public static Singleton getSingleton(){
      return s;
   }



   public void helloMethod(){
      System.out.println("hello using singleton obj only one of the class");
   }
   public static void main(String[] args){

      Singleton sobj=new Singleton();
      sobj.helloMethod();
      s.helloMethod();

      System.out.println(s.hashCode());
      System.out.println(sobj.hashCode());

   }
}
