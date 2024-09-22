class LebelBreak{

public static void main(String args[]){
out:
 
for(int i=0; i<=5; i++){
    System.out.println("Inner  "+i);
    for(int j=0; j<=5; j++){
 System.out.println("     Outer   "+j);
 if (j==2)
break;}
}
}
}