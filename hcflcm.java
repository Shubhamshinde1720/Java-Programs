import java.util.*;
class HcfLcm{
    public static void main(String args[]){

        Scanner shub=new Scanner(System.in);
        System.out.println("Please enter first number a");

        int a=shub.nextInt();
        System.out.println("Please enter second number");
        int b=shub.nextInt();
        int s=0;
        int hcf=0;
        int lcm=0;

        if(a<b)
        s=a;
        else
        s=b;

        for(int i=1; i<=s; i++){
            if((a%i==0)&&(b%i==0)){
                hcf=i;
            }
        }

     System.out.println(" HCF : "+hcf);
     lcm=(a*b)/hcf;
     System.out.println(" LCM : "+lcm);
        
    }
}