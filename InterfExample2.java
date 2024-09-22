interface Interf2{
     void m1();
 //public abstract void m2();
}


class InterfExample2 implements Interf2{
  public  void m1(){
        System.out.println("hello interf m1()");
        
    }
    public static void main(String[] args){

        InterfExample2 obj = new InterfExample2();
        InterfExample3 obj1 = new InterfExample3();

       obj.m1();
       obj1.m2();


    }
}
class InterfExample3 extends InterfExample2{
public void m2(){
    System.out.println("hello from inter m2()");
  }

 public static void main(String[] args) {

   }
 }