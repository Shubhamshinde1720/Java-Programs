public class Constructor3 {
   static int count =0;

   {
      count++;
   }
   Constructor3(){

   }

   Constructor3(int i){

   }

   Constructor3(double d){

   }

   public static void main(String[] args) {
      Constructor3 cobj=new Constructor3();
      Constructor3 cobj2=new Constructor3(11);
      Constructor3 cobj3=new Constructor3(11.5);
      Constructor3 cobj4=new Constructor3();
      Constructor3 cobj5=new Constructor3(11);
      Constructor3 cobj6=new Constructor3(11.5);


      System.out.println("the number of objects are created :: "+count);
   }
}
