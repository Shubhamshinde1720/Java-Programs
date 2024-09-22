import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ElevenAuthor {

   public static void main(String[] args) {
      
   
   Statement st=null;
   ResultSet rs=null;

   try{
      String url= "jdbc:mysql.jdbc.Driver";
      String user="root";
      String pass="root";
      String Driver="com.mysql.jdbc.Driver";

      String Query="select * from author where city like N%";
      Class.forName(Driver);

      Connection con=DriverManager.getConnection(url,user,pass);
      Statement st2=con.createStatement();
      ResultSet rs2=st2.executeQuery(Query);

      while(rs2.next()){
         int authorid=rs2.getInt("authorid");
         String name=rs2.getString("name");
         String address=rs2.getString("address");
         String city=rs2.getString("city");
         System.out.println("............");
         System.out.println(authorid+"\t"+name+"\t"+address+"\t"+city);

      }
   }
   catch(Exception e){
      e.printStackTrace();
   }
   
}
}
