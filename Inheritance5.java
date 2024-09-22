 class A {
   public void m1(){
      System.out.println("hello from m1() method");
   }
}

class B extends A{
   public void m2(){
      System.out.println("hello from m2() mehtod");
   }

   public static void main(String[] args) {
      B aobj=new B();
      aobj.m1();
      aobj.m2();
}

public class Inheritance5{
   
   }
}