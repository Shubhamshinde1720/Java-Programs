class ArrayMatrixTranspose{
    public static void main(String args[]){
        int i,j;

        int arr[][]={
                       {111,222,333},
                       {444,555,666},
                       {777,888,999}
        };

        for(i=0; i<arr.length; i++){
            for(j=0; j<arr.length; j++){
                System.out.print("  "+arr[i][j]);

            }
            System.out.println();
            

        }
    }
}