class Continue{
public static void main(String args[]){

int num=100;
int i;

 System.out.println("This is program for continue keyword and skip 11 divisible in 1 to 100");


for(i=0; i<=num; i++){
   if(i%11==0){
   continue;
}
         System.out.println(i);
}
}
}