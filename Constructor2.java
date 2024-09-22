public class Constructor2 {
   
   String name ;
   int age ;
   int rollno;


   Constructor2(String name,int age,int rollno){
      System.out.println("constructro2 printed now");
      this.name=name;
      this.age=age;
      this.rollno=rollno;

   }


   public static void main(String[] args) {
      Constructor2 cobj=new Constructor2("shubh", 21, 27);
      System.out.println(cobj.name+cobj.age+cobj.rollno);

   }
}
