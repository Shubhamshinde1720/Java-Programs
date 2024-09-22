public class Replace {
   

   public static void main(String[] args) {
      String str="12.344.553.56";
      String str2="1.2.3.4";
      String str3="11.22.333.44.55";

      System.out.println(toReplace(str));
      System.out.println(toReplace(str2));
      System.out.println(toReplace(str3));

   }

   public static String toReplace(String k){
      return k.replace(".", "[.]");
   }
}
