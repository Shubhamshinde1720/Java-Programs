public class MultipleInheritance implements Walkable,Swimable{
   
 public void walk(){
   System.out.println("Duck is walking ");

 }

 public void swim(){
   System.out.println("Duck is swimming");
 }

 public static void main(String[] args) {
   MultipleInheritance obj=new MultipleInheritance();
   obj.swim();
   obj.walk();
 }
}

interface Walkable{
   public void walk();
}

interface Swimable{
   public void swim();
}