import java.util.Scanner;
class MaximumFind{
    public static void main(String args[]){
        int j,k,l;
     Scanner shub=new Scanner(System.in);
        System.out.println("Please enter values of j k and l");
        j=shub.nextInt();
        k=shub.nextInt();
        l=shub.nextInt();

     if(j>k && j>l){
        System.out.println("j is greatest : "+j);
     }
        else if(k>j && k>l){
            System.out.println("k is greatest : "+k);

        }else{
            System.out.println("l is greatest : "+l);
        }
     }
    }

