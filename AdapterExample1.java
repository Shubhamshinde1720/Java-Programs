interface PersonService{
    public void print();

    public void eat();

    public void speak();

    public void walk();

    public void talk();

    public void sleep();

    public void run();

    public void jump();

    public void play();
}

public abstract class  AdapterExample1 {

    public void print(){
    }

    public void eat(){

    }

    public void speak(){

    }

    public void walk(){

    }


public void bark(){
    }

    public void sleep(){

    }

    public void run(){

    }

    public void jump(){

    }

    public void play(){
    }
}

class  Person extends AdapterExample1{

     public void print(){
        System.out.println("hello its print method");
    }

    public void eat(){
                System.out.println("hello its eat method");
    }

    public void speak(){
                System.out.println("hello its speak method");
    }

    public void walk(){
            System.out.println("hello its walk method");
    }

    public void sleep(){
                System.out.println("hello its sleep method");
    }

    public void run(){
                System.out.println("hello its run method");
    }

    public static void main(String[] args) {
        Person pobj=new Person();

        pobj.print();
        pobj.eat();
        pobj.sleep();
        pobj.walk();
        pobj.run();
        pobj.speak();

    }

}

class Animal extends AdapterExample1{
    public void bark(){
        System.out.println("hello its bark method");
    }


    public void jump(){
            System.out.println("hello its jump method");

    }


     public void play(){
        System.out.println("hello its play method");
    }

     public void sleep(){
                System.out.println("hello its sleep method");

    }

    public void run(){
                System.out.println("hello its run method");

    }


    public static void main(String[] args) {
        Animal aobj=new Animal();

        aobj.bark();
        aobj.sleep();
        aobj.run();
        aobj.jump();
        aobj.play();
    }

}