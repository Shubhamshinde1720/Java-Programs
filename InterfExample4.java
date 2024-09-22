interface A{
    void m1();
}

interface B{
    void m2();
}

interface C extends A,B{

}

class InterfExample4 implements C{
    public void m1(){
        System.out.println("hii interface A");
    }

    public void m2(){
        System.out.println("hello interface B");
    }
    public static void main(String[] args) {
        InterfExample4  obj=new InterfExample4();
        obj.m2();
        obj.m1();
    }
}