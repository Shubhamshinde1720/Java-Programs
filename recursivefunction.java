class RecursiveFunction1{

public static void recursive(){
System.out.println("Hello ");
recursive();
}

public static void main(String args[]){
System.out.println("HIII FROM MAIN METHOD");
recursive();
}
}