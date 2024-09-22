import java.util.Scanner;
class CommissionNested{
    public static void main(String args[]){
        Scanner shub=new Scanner(System.in);
        double sales,commission;
        System.out.println("Please enter sales value");
        
        sales=shub.nextDouble();

        if(sales<5000){
            commission=0;
            System.out.println("Your commission is 0% :"+commission);
        }else if(sales<10000){
            commission=sales*0.05;
            System.out.println("Your commission is  5%:"+commission);
        }else if(sales<20000){
            commission=sales*0.10;
                        System.out.println("Your commission is 10% :"+commission);

        }else if(sales<30000){
            commission=sales*0.12;
                        System.out.println("Your commission is 12% :"+commission);


        }else{
            commission=sales*0.15;
                        System.out.println("Your commission is 15% :"+commission);

        }
    }
}