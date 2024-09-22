class HOTEL{
  
String hotel;
String distance;
 }

class ObjectInitializationByReference{

public static void main(String args[]){

HOTEL H1 =new HOTEL();
HOTEL H2 =new HOTEL();
HOTEL H3 =new HOTEL();

H1.hotel="TAJ HOTEL MUMBAI";
H1.distance="560km";

H2.hotel="ONE PULS HOTEL BANGLORE";
H2.distance="700km";

System.out.println(H1.hotel + H1.distance);
System.out.println(H2.hotel + H2.distance);

}
}




