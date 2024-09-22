class ArrayAscending{
    public static void main(String args[]){
        int i,j, temp;
        int array[]={5,6,3,16,57,87,6,47,99,32,24};

        System.out.print("Before ascending ......");
        for(i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }

        for(i=0; i<array.length; i++){
            for(j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.print("\n After Ascending.......");
        for(i=0; i<array.length; i++){
            System.out.print(" " +array[i]);
        }
    }
}