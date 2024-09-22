import java.util.*;
class OnlyEvenIn100{
    

    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        System.out.println("please enter any numver greater than 100");
        int num=shub.nextInt();

        for(int i=0; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }else{
                 continue;
            }
        }
                    

    }

}