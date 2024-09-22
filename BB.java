package pack1;

public class AA{

    protected void m(){
        System.out.println("most misunderstood modifier");
    }
}

class BB extends AA{
    public static void main(String[] args){
        BB b=new BB();
        b.m();

        AA a=new AA();
        a.m();

        AA k=new BB();
        k.m();
    }
}