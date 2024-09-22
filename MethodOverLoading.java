public class MethodOverLoading {
   

   public static void main(String[] args) {
      String s="Bombay is a beautiful city...";
      String s1="Chennei is a peaceful city....";
      int i1=4;
      m1();
      m1(s);
      m1(s1,i1);

   }



public static void m1(){

   for(int i=0; i<2; i++){
      System.out.println("Delhi is a Important city..");
   }
}

public static void m1(String s){
 

   for(int j=0; j<3; j++){
      System.out.println(s);
   }

}

public static void m1(String s1,int i1){
   for(int i=0; i<4; i++){
      System.out.println(s1);
   }
}

}