abstract class Parent{
    Parent(){
        System.out.println(hashCode());
    }
}

class C extends Parent{
    C(){
        System.out.println(hashCode());
    }
}

public class ConstructorExample {

    public static void main(String[] args) {
        C cobj=new C();

        System.out.println(cobj.hashCode());
    }

}