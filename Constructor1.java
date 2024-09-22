public class Constructor1 {

    String name;
    int age;

    Constructor1(){
        System.out.println("name : "+name+" age : "+age);

    }
    

    
}

class A extends Constructor1{
    String color;
    int code;

    A(String name,int age,String color,int code)
    {
        System.out.println();
    }

   
}

class Test{
    public static void main(String[] args){
        A obj=new A("n",2,"g",4);

    }
}