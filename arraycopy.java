class ArrayCopy{
public static void main(String args[]){

char arr1[]={'s','h','u','b','h','a','m'};

char arr2[]=new char[3];


System.arraycopy(arr1,0,arr2,0,3);
System.out.println(arr2);
}}