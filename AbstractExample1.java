abstract  class Person{
    String name;
    int age;
    double height;
    double weight;
    String address;
    String hobby;
    long phone_no;
    String email_id;
    long adhar_no;



    public Person(String name,int age,double height, double weight,String address,String hobby,long phone_no,String email_id,long adhar_no){


         this.name=name;
         this.age=age;
         this.height=height;
         this.weight=weight;
         this.address=address;
         this.hobby=hobby;
         this.phone_no=phone_no;
         this.email_id=email_id;
         this.adhar_no=adhar_no;
    }

    

}

class Student extends Person{
    
    String college;
    int rollno;
    String collegeid;
    String section;

    Student(String name,int age,double height, double weight,String address,String hobby,long phone_no,String email_id,long adhar_no,int rollno,String collegeid,String college,String section){
        super(name,age,height,weight,address,hobby,phone_no,email_id,adhar_no);
        this.rollno=rollno;
        this.collegeid=collegeid;
        this.college=college;
        this.section=section;

            System.out.println("Name = "+name+"\nAge = "+age+ "\nHeight = "+height+"\nWeight = "+weight+"\nAddress = "+address+"\nHobby = "+hobby+"\nPhone_no = "+phone_no+"\nEmail_id = "+email_id+"\nAdhar_no = "+adhar_no+"\nRollno = "+rollno+"\nCollege_id = "+collegeid+"\nCollege_Name = "+college+"\nSection = "+section);



    }




}
class Teacher extends Person{
    String subject;
    String tid;
    String position;


  Teacher(String name,int age,double height, double weight,String address,String hobby,long phone_no,String email_id,long adhar_no,String subject,String tid,String position){
      super(name,age,height,weight,address,hobby,phone_no,email_id,adhar_no);
         this.subject=subject;
         this.tid=tid;
         this.position=position;


         System.out.println("Name = "+name+"\nAge = "+age+ "\nHeight = "+height+"\nWeight = "+weight+"\nAddress = "+address+"\nHobby = "+hobby+"\nPhone_no = "+phone_no+"\nEmail_id = "+email_id+"\nAdhar_no = "+adhar_no+"\nSubjct = "+subject+"\ntid = "+tid+"\nPosition = "+position);

         
 }
 }


public class AbstractExample1{
    public static void main(String[] args){
        System.out.println("Details of student are shown below........................");
        Student obj=new Student("shubham shinde",21,168.11,61.14,"Nanded ","Cricket",899905138,"shubhamshinde1720@gmail.com",894548545,27,"2325MCAL27","G.H.Raisoni college","C");


        System.out.println("\nTeacher details are shown below...........................");
        Teacher tobj=new Teacher("Deepa", 20, 14, 40, "Nagpur", "Teaching",899522154,"deepamam@123.com",858446258, "java", "GH42134", "Junior Professor");
    }

}

