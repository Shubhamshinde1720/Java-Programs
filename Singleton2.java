public class Singleton2 {
   private static Singleton2 sobj=null;

   private Singleton2(){

   }

   public static Singleton2 getSingleton2(){
      if(sobj==null){
         sobj=new Singleton2();
      }
      return sobj;
   }

    void m2(){
      System.out.println("singleton class apporch2 with null method ");
    }
   public static void main(String[] args) {
      sobj=new Singleton2();

      sobj.m2();
      
   }
}

  
