class RecursiveFunction2{

public static int num=0;

public static  void print(){
    num++;
    if(num<100){
   System.out.println("Hello: "+num);
   print();
}
}

public static void main(String args[]){
print();
}
}