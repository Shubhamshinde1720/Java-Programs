public class Test {

   public int method(){
       int a=0;
      a++;
      return a;
   }

   public static void main(String[] args){
      Test t=new Test();
      t.method();
      int j=t.method();
      System.out.println(j);
   }
}