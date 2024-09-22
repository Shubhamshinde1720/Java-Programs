class Synchronization1{
    public static void main(String[] args){

BankAccount  account1=new BankAccount(90000.77);

Thread depositThread=new Thread(() ->
   {
    for(int i=0; i<5; i++){
        account1.deposit(800);
        System.out.println("Credited 800rs");
    }
    });

    Thread withdrawThread =new Thread(() ->
   {for(int i=0; i<3; i++){
      account1.withdraw(199);
      System.out.println("Debited 199rs");
   

   }
    });

    depositThread.start();
    withdrawThread.start();

    try{
        depositThread.join();
        withdrawThread.join();
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("Final Account Balance is :: "+account1.getBalance());

}

}

public class BankAccount{


    private double bank_balance;

    public BankAccount(double intitial_balance);
    {
       this.bank_balance=intitial_balance;
    }

    public synchronized void deposit(double amount){
        bank_balance +=amount;
    }

    public synchronized void withdraw(double amount){
        if(bank_balance>=amount){
            bank_balance -=amount;
            
        }else{
            System.out.println("Insufficent funds for Withdrawal!! ");
        }
    }

    public double getBalance(){
        return bank_balance;
    }
}


