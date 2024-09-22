
public class Overriding1{
  public static void main(String[] args) {
   
  
   P p=new P();
   C c=new C();
   P pc=new C();
  System.out.println(p.x);
  System.out.println(c.x);
  System.out.println(pc.x);
}
}
class P {

    int x=999;

   
}

class C extends P{
  final int x=888;
}