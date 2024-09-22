public class MultiThreading9 {
   public static void main(String[] args){
 Thread t=new Thread();
 
 t.start();

 System.out.println("hello ");

 t.start();
}


}