class Inheritance1{
public static void main(String args[]){
Cow c1=new Cow();
}
}
class Animal{

Animal(){
System.out.print("Cow");
}}

class Cow extends Animal{
   Cow(){
super();
System.out.println("Woooooo");
}
}

