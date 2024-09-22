class RAISONI extends MCA{

public static void Print(){
System.out.println("its a print method in raisoni class");
}

public static void main(String args[]){

MCA dept=new MCA();
dept.Faculty();

Print();
}


 

}

class MCA{


String math="Sandhya dhake";
String dbms="Yoges sir";
String java="Deepa mam";
String php="mam";
String os="mam";


public void Faculty(){
System.out.println("math faculty are: "+math);
System.out.println("dbms faculty are: "+dbms);
System.out.println("java faculty are: "+java);
System.out.println("php facutly are: "+php);
System.out.println("os faculty are: "+os);
}
}
