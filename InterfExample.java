interface Interf{
    public void m1();
}

class InterfExample implements Interf{

    public void m1(){
            System.out.println("hello froom Interface");
        }
    public static void main(String[] args) {
        InterfExample obj=new InterfExample();
        obj.m1();
    }
}