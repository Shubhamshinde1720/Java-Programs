class MethodsInException{

public static void main(String args[]){

try{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);

int ans=a/b;

if(b==0){
throw new ArithmeticException();
//System.out.println("please enter nonzero number");
}

}

catch(Exception e){
System.out.println("use getmessage method in throwable class");
System.out.println(e.getMessage());}
}
}