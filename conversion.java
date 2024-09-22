class Conversion{
    public static void main(String args[]){
        System.out.println("This is program for converting rupees and paisa seperatly");

//This is program for converting rupees and paisa seperatly
    double value=55.99;
    int rupees =(int) value;
    double paisa=(value-rupees)*100;

    System.out.println("Rupees :"+ rupees);
    System.out.println("Paisa :" +(int)paisa);

    }
}