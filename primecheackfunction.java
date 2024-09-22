class PrimeCheackFunction{

public static boolean Isprime(int num){
boolean flag=true;
  for(int i=2; i<num; i++){
    if(num%i==0){
    flag = false;
    break;}

  }return flag;
}

public static void main(String args[]){

int num=888;
boolean flagg=true;

if(Isprime(num)){
System.out.println(num +"    is Prime ");
}else{
System.out.println(num +"is not Prime");
}

}}
