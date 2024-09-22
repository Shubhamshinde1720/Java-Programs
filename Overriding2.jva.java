class Overriding2{

   public static void main(String args){

   }

}

class P{
   public void m1(int x){
      System.out.println("hello from Parent");
   }
}
class C extends P{
   public void m1(int x){
      System.out.println("hello from child ");
   }
}