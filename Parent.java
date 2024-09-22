class Parent{
    public static void main(String[] args){
        System.out.println("String args");
    }
    public static void main(int[] args){
        System.out.println("int args");
    }
}

class Child extends Parent{
    public static void main(String[] args){
        System.out.println("in child class String args");
    }
}