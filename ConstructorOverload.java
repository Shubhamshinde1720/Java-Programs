public class ConstructorOverload {
   
public static void main(String[] args) {
   Employee12 e12=new Employee12();
   e12.Employee12Details();
   
   Employee12 e13=new Employee12(21,"Shubham","IBM");
   e13.Employee12Details();
}

}

class Employee12{
  
      int age;
      String name;
      String company;

   Employee12(){
      age=22;
      name="XYZ";
      company="WWW";
   }

   Employee12(int ag, String nm,String com){
       age=ag;
       name=nm;
       company=com;

   }

      void Employee12Details(){
      System.out.println("Name of the employee is "+name);
      System.out.println("Age of the employee is "+age);
      System.out.println("The company of employee is "+company);
   }
}
