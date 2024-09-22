public class Constructor5 {
   
   Constructor5(){
      this(10);
      System.out.println("no args constructor");
   }

   Constructor5(int i){
      this(22.5);
         System.out.println("int args constructor");
      }

      Constructor5(double d){
         System.out.println("double args constructor");
      }


   public static void main(String[] args) {
      Constructor5 cobj=new Constructor5();
      System.out.println("\n");
      Constructor5 cobj2=new Constructor5(33);
            System.out.println("\n");
      Constructor5 cobj3=new Constructor5(11.2);

   }
}
