class ExceptionMethods{
    public static void main(String args[]){
      
      try{
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int ans=a/b;
        System.out.println("The answer is "+ans);
      }
        catch(Exception e){
          System.out.println(e.getMessage());
          System.out.println(e.getStackTrace());
        }
    }
}