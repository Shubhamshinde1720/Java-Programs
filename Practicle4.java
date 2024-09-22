public class Practicle4 {
   
   public static void main(String[] args) {
  
      Faculty f1=new Faculty();
      f1.setPersonDetails("Shubham",23,"nanded",170,55);
      f1.setEmployeeDetails(20000000, 18, "amazon");
      f1.facultyDetails();

      System.out.println(" ");

      f1.setPersonDetails("Naman", 20, "Nanded", 121, 55);
      f1.setEmployeeDetails(300000, 11,"Google");
      f1.facultyDetails();

   }
}


class Person{
   String name;
   int age;
   String address;
   int height; 
   int weight;

   public void setPersonDetails(String nm, int ag,String add,int het,int wet){
      name=nm;
      age=ag;
      address=add;
      height=het;
      weight=wet;


   }

   public void showPersonDetails(){
      System.out.println("The name of person is: "+name);
      System.out.println("The age of person is:  "+age);
      System.out.println("The address of the person is: "+address);
      System.out.println("The height of the person is: "+height);
      System.out.println("The weight of the person is: "+weight);


   }



}

class Employee extends Person{
   int salary;
   int id;
   String company;

   public void setEmployeeDetails(int sal,int idd,String comp){
      salary=sal;
      id=idd;
      company=comp;
   }

   public void showEmployeeDetails(){
      System.out.println("The salary of the employee is: "+salary);
      System.out.println("The id of employee is: "+id);
      System.out.println("The company name of the employee is: "+company);
   }


}

interface Bonus {
   int bonus=1000;
   public void compute();

   
}

class Faculty extends Employee implements Bonus{
   int ammount;

   public void compute(){
      System.out.println("Bonus is: "+bonus);
      ammount = salary+bonus;
   }


   public void facultyDetails(){
      showPersonDetails();
      showEmployeeDetails();
      compute();
      System.out.println("The total ammount is "+ammount);
}
}

   

   


