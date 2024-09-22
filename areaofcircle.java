import java.util.*;
class AreaOfCircle{

public static void areaofcircle(float r){
float area=22/7*(r*r);
System.out.println(area+" this area of circle that redius is :"+r);
}
public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter the value of radius of circle");
float r=shub.nextFloat();


areaofcircle(r);
}
}

