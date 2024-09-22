interface InterfVariables{
    int x=10;
    // public int x=10;
    // static int x=10;
    // final int x=10;
    // public static int x=10;
    // public static final int x=10;
}

class InterfExample5 implements InterfVariables{
   
    public static void main(String[] args) {
        int  x=999;
    
     System.out.println(InterfExample5.x);
     System.out.println(x);
}
}