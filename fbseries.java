class FBSeries{

public static void main(String args[]){
int a=0;
int b=0;

for(int i=0; i<9; i++){



int ans=a+b;
 a=b;
 b=ans;
System.out.println(ans);
}


}
}