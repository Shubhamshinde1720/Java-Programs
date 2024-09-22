class  Array1{
    public static void main(String args[]){
        int arr[]={11,22,33,44,55,66,77,88,99};

        System.out.println("Printing array by for loop");

        for(int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }

        for(int key:arr){
            System.out.println(key);
        }
    }
}