class MainOutsideClass{

long jearsyno=18;
String name="Virat Kohli";

}

class MainClass{
 
public static void main(String args[]){
MainOutsideClass player=new MainOutsideClass();
System.out.println(player.jearsyno);
System.out.println(player.name);
}
}