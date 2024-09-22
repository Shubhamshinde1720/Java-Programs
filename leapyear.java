import java.util.*;
class LeapYear{
public static void main(String args[]){
Scanner shub=new Scanner(System.in);
System.out.println("Please enter any year to cheack leap or not");n
int year=shub.nextInt();

if(year%4==0){
System.out.println(year+ ": This is a leap year");
}else{
System.out.println(year +": This is not a leap year ");
}
}
}
