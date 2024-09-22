class Student{
int roll;
String name;
static String College="IBM";

Student(int r,String n){
roll=r;
name=n;
}

public void Dislplay(){
System.out.println(roll+""+name+""+College);
}
}
class TestStaticVariable{
public static void main(String args[]){
Student s1=new Student(18,"SHUBH");
Student s2=new Student(19,"NIKK");

s1.Display();
s1.Display();
}
}