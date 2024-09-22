class BreakOut{
public static void main(String args[]){
out:

for(int j=1; j<=5; j++){
 System.out.println("Inner print: "+j);
       for(int k=0; k>=-5; k--){
 System.out.println("     Outer print: "+k);
     if(k==4)
     break out;}
}
}}