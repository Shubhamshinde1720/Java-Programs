import java.util.*;
class Array2DUser{
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        int i,j;

        int brr[][]=new int[3][3];

        Scanner shub=new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("Enter Values :: ");
                arr[i][j]=shub.nextInt();
            }
        }

        System.out.println(" \n Matrix A :: ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();

        }

        for(i=0; i<arr.length; i++){
            for(j=0; j<arr.length; j++){
                brr[i][j]=arr[i][j];
            }
        }

        System.out.println("Trnaspose ARR to BRR ");

        for(i=0; i<brr.length; i++){
            for(j=0; j<brr.length; j++){
                System.out.print("  "+brr[i][j]);
            }
            System.out.println();
        }
    }
}