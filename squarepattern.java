import java.util.*;
class SquarePattern{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        int num=5;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                if(j==5){
                    System.out.println();
                }
                
            }
        }
    }
}