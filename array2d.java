class Array2D{
    public static void main(String args[]){
        int arr[][]=new int[2][3];
        int i,j;
        int x=1;

        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                arr[i][j]=x;
                x++;
            }

        }

        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                System.out.print(arr[i][j]+"  ");
                System.out.println();
            }
        }
    }
}