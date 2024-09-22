
import java.util.*;
class AdvancedForLoop{
    public static void main(String args[]){
        String ss="BHARAT MATA KI JAY";

        char strarr []=new char[ss.length()];

        for(int i=0; i<ss.length(); i++){
            strarr[i]=ss.charAt(i);
        }

        for(char kk:strarr){
            System.out.print(kk);
        }
    }
}