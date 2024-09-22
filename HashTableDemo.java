
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {

   public static void main(String[] args){
      Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
      ht.put(11,"shub");
      ht.put(12,"pal");
      ht.put(13,"aditya");
      ht.put(14,"mayur");

      for(Map.Entry k:ht.entrySet()){
         System.out.println(k.getKey()+" "+k.getValue());
      }

   }
   
}
