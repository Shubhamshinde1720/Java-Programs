class Class1{

public static void main(String args[]){


Student s1=new Student();
Student s2=new Student();

s1.SetRollNo(17);
s1.SetName("ABD");
s1.SetMarks(44);

System.out.println("roll no: "+s1.GetRollNo());
System.out.println("name: "+s1.GetName());
System.out.println("marks: "+s1.GetMarks());

s2.SetRollNo(18);
s2.SetName("King");
s2.SetMarks(100);

System.out.println("roll no:"+s2.GetRollNo());
System.out.println("name:"+s2.GetName());
System.out.println("marks :"+s2.GetMarks());




}

int rollno;
String name;
float marks;


public void SetRollNo(int r){
rollno=r;
}
public void SetName(String n){
name=n;
}
public void SetMarks(float m){
marks=m;
}

public  int GetRollNo(){
return rollno;
}
public  String GetName(){
return name;
}
public  float GetMarks(){
return marks;
}

}
