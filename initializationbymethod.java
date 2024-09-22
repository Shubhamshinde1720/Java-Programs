class Currency{

String india;
String america;
String dubai;
String japan;

void insert(String i, String a,String d,String j){
india=i;
america=a;
dubai=d;
japan=j;

}
void print(){
System.out.println(india + "  " + america +"   " + dubai +"  " + japan);
}
}
 
class InitializationByMethod{
public static void main (String args[]){
Currency c1= new Currency();
Currency c2=new Currency();

c1.insert("Rupees","Dollor","Derum","Kanji");
c2.insert("paisa","money","habibi","null");

c1.print();
c2.print();
         }
}