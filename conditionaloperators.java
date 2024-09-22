class ConditionalOperator{
 
public static void main(String args[]){
int a=4, b=11, c=21, max;
max = (a>b)?(a>c) ? a:c : (b>c) ?b:c;
System.out.println("a =" + (a) + "    b =" + (b)  + "    c =" +(c));
System.out.println(max);
}
}