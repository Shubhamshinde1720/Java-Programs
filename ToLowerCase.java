public class ToLowerCase {

   public static void main(String[] args){
      String str="Hello";
      String str2="LOVELY";
      String str3="JOLLY";

      System.out.println(toLow(str));
      System.out.println(toLow(str2));
      System.out.println(toLow(str3));

   }
   public static String toLow(String k){
      return k.toLowerCase();
   }
}
