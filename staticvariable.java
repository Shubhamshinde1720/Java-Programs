class StaticVariable{
static int a=99;
void method(){

int b=98;
System.out.println(" b is an local variable and   b=" +b);
}
public static void main(String args[]){
int num=50;
System.out.println(" a is an static variable and  a="+a);
StaticVariable stat=new StaticVariable();
stat.method();
System.out.println(" num is an instance variable and num="+num);
}
}