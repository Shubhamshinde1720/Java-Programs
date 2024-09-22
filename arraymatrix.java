class ArrayMatrix{
    public static void main(String args[]){
        int i,j;

        int a[][]=new int[3][3];

        a[0][0]=0;
        a[0][1]=1;
        a[0][2]=1;

        a[1][0]=1;
        a[1][1]=0;
        a[1][2]=1;

        a[2][0]=1;
        a[2][1]=1;
        a[2][2]=0;

        for(i=0; i<a.length; i++){

            for(j=0; j<a.length; j++){
                System.out.print("  "+a[i][j]);

            }
            System.out.println();
        }
    }
}