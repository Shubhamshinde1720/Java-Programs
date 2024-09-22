/**
 * Exception_throws
 */
public class Exception_throws {

      public static void main(String[] args) throws Exception{
            m1();
      }

      public static void m1() throws Exception{
            m2();
      }

      public static void m2() throws Exception{
            Thread.sleep(1000);
            System.out.println("hello");
      }
}