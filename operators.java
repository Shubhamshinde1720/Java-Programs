class Operators{

public static void main(String args[]){

int n1=20;
int n2=30;

int sum=n1+n2;
System.out.println("This is Arithmatic Operator");
System.out.println("n1 ="+n1);
System.out.println("n2 ="+n2);
System.out.println("The summation of n1 and n2 is ="+sum); 

System.out.println();
System.out.println("This is increment and decrement operators n1++  n2--");
int n3=++n1;
int n4=--n2;
System.out.println("increment of n1++ ="+n3);
System.out.println("Decrement of n2-- ="+n4);

System.out.println();
System.out.println("This is an example of Shift operators <<,>>,>>>,<<<");
System.out.println("left shift operator for n1 =" +(n1<<2));
System.out.println("right shift operator for n1 ="+(n1>>2));

System.out.println();
System.out.println("This is an example of relational operators ==,!=,<,<=,>,>=");
int a=11;
int b=13;
int c=2;
System.out.println("a =" + (a) + "    b =" + (b)  + "    c =" +(c));
System.out.println("a==b  ="+ (a==b));
System.out.println("a!=b =" + (a!=b));
System.out.println("a<b =" + (a<b));
System.out.println("a<=b =" + (a<=b));
System.out.println("a>b =" + (a>b));
System.out.println("a>=b =" + (a>=b));


System.out.println();
System.out.println("This is an example of Logical operators &&,||,!");
System.out.println("a is largest :" + ((a>b)&&(a>c)));
System.out.println("b is largest :" + ((b>a)&&(b>c)));
System.out.println("c is largest :" + ((c>a)&&(c>b)));

System.out.println("This an example of Assignment operators +=, -=,%=, etc");
System.out.println("a =" + (a) + "    b =" + (b)  + "    c =" +(c));
System.out.println("a+=10  ="+ (a+=10));
System.out.println("a-=10  =" + (a-=10));
System.out.println("a%=10  ="+ (a%=10));













}
}