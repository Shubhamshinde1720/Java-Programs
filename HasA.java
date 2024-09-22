public class HasA {
   public static void main(String[] args) {
      
   }
}

class Engine{
   public void engine(){
      System.out.println("engine specific works");
   }
}

class  Car{
   public static void main(String[] args) {
      Engine e=new Engine();
      e.engine();
   }
}
