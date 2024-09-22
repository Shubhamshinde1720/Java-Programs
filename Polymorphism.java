import java.util.*;

public class Polymorphism {

   public static void main(String[] args){
   List al=new ArrayList();

   List ll=new LinkedList();

   List v=new Vector();

   Parent p=new Parent();
   Child c=new Child();

   p.m1();
   //p.m2();

   c.m1();
   c.m2();

   Parent pc=new Child();
   pc.m1();
   //pc.m2();


}
}

class Parent {
   public void m1(){
      System.out.println("parent method0");
   }
}

class Child extends Parent{
   public void m2(){
      System.out.println("child method");

   
   }
}
