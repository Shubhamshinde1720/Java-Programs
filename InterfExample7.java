interface Interf1 {

public void m1();

    
}

interface Interf2{
    public void m1(int i);

}


class IterfExample7 implements Interf1,Interf2{

    public void m1(){
        System.out.println("m1 implementation");
    }

    public void m1(int i){
        System.out.println("m1 int return immplementation");
    }

public static void main(String[] args){
    InterfExample7 obj=new InterfExample7();
    obj.m1();
    obj.m1(1);
}
}