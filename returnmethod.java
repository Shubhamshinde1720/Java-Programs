class ReturnMethod{

public static int sum(int a ,int b){
return a+b;

}

public static int greater(int a, int b){
 if(a>b)
   return a;
 else
   return b;
}

public static void main(String args[]){
int a=89; int b=44;
int ans=sum(a,b);
int greatern=greater(a,b);
System.out.println("This program is return sum from method sum a,b: ");
System.out.println(ans);
System.out.println("Print greater from a and b: "+greatern);
}}