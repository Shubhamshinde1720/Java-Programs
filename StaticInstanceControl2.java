public class StaticInstanceControl2 {

     public static void main(String[] args) {
      StaticInstanceControl2 obj=new StaticInstanceControl2();
   }
   
//    public static String m1(String s){
//       System.out.println("m1 method ");
//       return s;
//    }

//    StaticInstanceControl2(){
//       m=m1("1");

//    }

//    {
//       m=m1("2");
//    }

//    String m=m1("shubh");

 
// }

public static String m1(String s){
   System.out.println(s);
   return s;
}


static String m=m1("1");

{
   m=m1("2");
}

static {
   m=m1("3");
}

StaticInstanceControl2(){
   m=m1("4");
}
}