import java.lang.Math;
class AreaFunction{
public static void main(String args[]){

int radius=7;
int length=2,height=5;
int a=3,b=6,c=8;

System.out.println("Area of circle is: "+area(radius));
System.out.println("Area of rectangle is: "+area(length,height));
System.out.println("Area of Triangle is: "+area(a,b,c));

}
public static float area(int r){
return 22/7*r;}


public static float area(int l,int b){
 return l*b;
}

public static float area(int a,int b,int c){
float s=a+b+c/2.0f;
return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));

}}