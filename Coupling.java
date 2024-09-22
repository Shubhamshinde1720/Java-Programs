public class Coupling {
   public static void main(String[] args) throws Exception{
      D d=new D();
      d.m1();
      C c=new C();
      System.out.println(c.k);

   }
   
}

class A{
   static int i=B.j;
   
}
class B{
   static int j=C.k;

}

class C{
   static int k=D.m1();
}

class D{
   public static int m1(){
      return 9;
   }
}
