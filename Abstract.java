import java.util.Scanner;
 abstract class  Shape{
    abstract void areaOfRectangle();
    abstract void areaOfTriangle();

}

public class Abstract extends Shape{
         Scanner shubh=new Scanner(System.in);



   void areaOfRectangle(){
      System.out.println("Please enter the length of Rectangle");
      int length=shubh.nextInt();
      System.out.println("Please enter the breadth of rectangle");
      int breadth=shubh.nextInt();

      float rectanglearea=length*breadth;

      System.out.println("The area of rectangle is = "+rectanglearea);
   }

     void areaOfTriangle(){
      System.out.println("Please enter the height of Triangle ");
      int height=shubh.nextInt();
      System.out.println("Please enter the widht of triangle");
      int width=shubh.nextInt();

      float trianglearea=(float)(0.5*height*width);
      System.out.println("The area of triangle is = "+trianglearea);
   }

   public static void main(String[] args) {
      Shape obj=new Abstract();
      obj.areaOfRectangle();
      obj.areaOfTriangle();
   }
}