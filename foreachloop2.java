class ForEachLoop2{
    public static void main(String args[]){
        int arr[]={11,22,33,44,55,66,77,88,99};

        for (int j:arr){
            System.out.println(j);
        }
        System.out.println();

        for(double k:arr){
            System.out.println(k);
        }
        System.out.println();

        for(float f:arr){
            System.out.println(f);
        }
    }
}