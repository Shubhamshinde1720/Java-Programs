
 class MethodOverloading{
   public static void m1(){
      System.out.println("m1() method with no args");
   }

   public static void m1(String s){
      System.out.println("m1() method with String args "+s);
   }

   public static int m1(int a, int b){
     int sum=a/b;
      return sum;
   }

   

   // public static float m1(int a,int b){
   //    return a+b;
   // }

   static float m1(float a,float b){
      return a+b;
   }



   public static void main(String[] args){
      m1();
      m1("x");

      System.out.println(m1(1,3));
      System.out.println(m1(1.0f,2.0f));
     // m1(1,1.0);
     //m1(2.9,2);

   }
}