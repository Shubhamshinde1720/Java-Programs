import java.io.*;
class InputConsole{
    public static void main(String args[]){
        Console shub=System.console();

        int num;

        System.out.println("Enter a Number");
        num=Integer.parseInt(shub.readLine());

        System.out.println("The given number : "+num);
        
    }
}