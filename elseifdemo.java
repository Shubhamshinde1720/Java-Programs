import java.util.Scanner;
class ElseIfDemo{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
System.out.println("Please enter value of a less than 6");
        int a=shub.nextInt();

        if(a==1){
            System.out.println("*");
        }else if(a==2){
                        System.out.println("**");

        }else if(a==3){
                        System.out.println("***");

        }else if(a==4){
                        System.out.println("****");

        }else if(a==5){
                        System.out.println("*****");

        }else
        System.out.println("Please enter a is less than 6");
    }
}