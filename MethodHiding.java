public class MethodHiding {
   public static void main(String[] args) {
      Parent p=new Parent();
      Child c=new Child();
      Parent pc=new Child();

      p.m1();
      c.m1();
      pc.m1();
   }

}

class Parent{
   public  void m1(){
      System.out.println("parent static method");
   }
}

class Child extends Parent{
   public  void m1(){
      System.out.println("child static method");
   }
}
