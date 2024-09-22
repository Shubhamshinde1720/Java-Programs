public class MethodSignature {
   public int m1(int i){
      return i;
   }

   public String m1(String s){
return s;
   }

   public static void main(String[] args){
      MethodSignature obj=new MethodSignature();
      System.out.println(obj.m1(3));
      System.out.println(obj.m1("shubh"));
      //obj.m3(11.1);
   }
}
