class Student{
    String name;
    int age;
    int marks;
    static String cname;

    public void getStudentInfo(){
         System.out.println(name+"  "+marks);
    }

    public static void getCollegeInfo(){
         System.out.println(cname);
    }

  public static void  getAverageInfo(int x,int y){
         System.out.println(x+y/2);

    }

    public void getCompleteInfo(){
         System.out.println(name+" "+age+" "+marks+" "+cname);
    }



    public static  void main(String[] args){
        Student s=new Student();
        

    s.getStudentInfo();
    s.getCompleteInfo();
        

    System.out.println("Static methods/n");

    getAverageInfo(10,20);
    getCollegeInfo();
    }
}