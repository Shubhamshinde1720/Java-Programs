
import java.util.*;
import java.io.*;
public class ArrayList{

   public static void main(String[] args){
     LinkedList<Integer> ll=new LinkedList<>();

     for(int i=0;i<23;i++){
      ll.add(i);
     }

     for(Object o:ll.toArray()){
      System.out.print((Integer)o+" ");
     }
   }
}