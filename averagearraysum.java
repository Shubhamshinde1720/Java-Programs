class AvgSumArray{
    public static void main(String args[]){
        
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum=0;

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
            sum=sum+i;
        }

        System.out.println("sum = "+sum);

        System.out.println("average sum= ");
        double average=sum/arr.length;
        System.out.println(average);
    }

}

