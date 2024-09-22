
import java.util.*;
import java.io.*;
public class ArrayList{

   public static void main(String[] args){
     ArrayList al=new ArrayList();

     for(int i=0;i<23;i++){
      al.add(i);
     }

     for(int i=0;i<23;i++){
      System.out.print(al.get(i)+" ");
     }
   }
}