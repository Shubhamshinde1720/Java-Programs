public class TypeCasting2 {
   public static void main(String[] args) {
      C c=new C();
      A a=new A();
      B b=new B();

      c.m1();
      ((B)c).m1();

      ((A)c).m1();

      System.out.println(c.x);
      System.out.println(b.x);
      System.out.println(a.x);
   }

}

class A{

   int x=777;
   public static void m1(){
      System.out.println("a");
   
   }
}

class B extends A{
   int y=888;
   public static void m1(){
      System.out.println("b");
   }
}

class C extends B{
   int z=999;
   public static void m1(){
      System.out.println("c");
   }
}
