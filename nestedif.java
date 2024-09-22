class NestedIf{
 public static void main(String args[]){
int marks =49;

if(marks<35){
System.out.println("Sorry you are not clear the exam :"+ marks);
}
else{
System.out.println("Congrats You are Pass the exam :"+ marks);
if(marks>=80){
System.out.println("Pass with first class");
}
else if(marks<=65){
System.out.println("Pass with second class");
}
else if(marks<=55){
System.out.println("Pass with third class");
}
}
}
}