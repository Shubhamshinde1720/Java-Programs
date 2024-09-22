import java.util.*;

class SwitchString{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println(" Enter Day Name : ");

        String dayname=shub.nextLine();
        dayname=dayname.toUpperCase();

        switch(dayname){

            case "MONDAY":
                System.out.println("It is day number 1: "+dayname);
                break;

                case "TUESDAY":
                                System.out.println("It is day number 2: "+dayname);
                                break;

                                case "WEDNESDAY":
                                                System.out.println("It is day number 3: "+dayname);
                                                break;

                                                case "THURSDAY":
                                                                System.out.println("It is day number 4: "+dayname);
                                                                break;

                                                                case "FRIDAY":
                                                                                System.out.println("It is day number 5: "+dayname);
                                                                                break;

                                                                                case "SATARDAY":
                                                                                                System.out.println("It is day number 6: "+dayname);
                                                                                                break;

                                                                                                case "SUNDAY":
                                                                                                                System.out.println("It is day number 7: "+dayname);
                                                                                                                break;
                                                                                                                
                                                                                                                default:
                                                                                                                System.out.println("Please enter valid day");






        }

    }
}