class Cars{

   void Brand(){
   System.out.println("BRAND");
}
}

class BMW extends Cars{

void Speed(){
System.out.println("340km/hr");
}
}

class Audi extends BMW{

void Engine(){
System.out.println("Audi has turbo v20");
}
}

class Inheritance2{
public static void main(String args[]){

Audi A8=new Audi();
A8.Brand();
A8.Speed();
A8.Engine();
}
}