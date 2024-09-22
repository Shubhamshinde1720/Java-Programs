class Functions{

public static void a(){
System.out.println("......Inside a before calling b");
b();
System.out.println("inside a after calling b");
}

public static void b(){
System.out.println("......Inside b before calling c");
c();
System.out.println("inside b after calling c");
}

public static void c(){
System.out.println("......inside c ");
}

public static void main(String args[]){

System.out.println(".....Inside main method before calling a");
a();
System.out.println("inside main method after calling a");
}
}