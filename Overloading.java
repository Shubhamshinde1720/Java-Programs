public class Overloading {


   public void m1(Animal a){
   System.out.println("animal version");
  }

  public void m1(Monkey m){
      System.out.println("monkey version");
   }

   public static void main(String[] args){

   
   Overloading obj=new Overloading();

   Animal a=new Animal();
   obj.m1(a);

   Monkey m=new Monkey();
   obj.m1(m);

   Animal am=new Monkey();
   obj.m1(am);

   // Monkey ma=new Animal();
   // obj.m1(ma);
   
   }
}


class Animal{
  
}

class Monkey extends Animal{
   

}