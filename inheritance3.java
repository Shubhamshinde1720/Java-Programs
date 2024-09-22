class Banks{
void Names(){
System.out.println("Indian Banks");
}
}

class SBI extends Banks{
void ROISBI(){
System.out.println("SBI has a 9.44 ROI");
}
}

class PNB extends Banks{
void ROIPNB(){
System.out.println("PNB has 7.50 ROI");
}
}
class Inheritance3{
public static void main(String args[]){
SBI branch1=new SBI();
branch1.Names();
branch1.ROISBI();

PNB branch2=new PNB();
branch2.Names();
branch2.ROIPNB();

}
}