package Challenge.kgcoding.Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private  double balance;


    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    public void depositMoney(double money){
         if (balance<=0){
             System.out.println("Chala ja bsdk");
         }else {
             balance -= money;
         }
     }
     public double withdrawMoney(double money){
         if (balance<=0){
             System.out.println("Chala ja bsdk");
         } else if (balance >= money) {
             balance += money;
         }else {
             money=balance;
             balance=0;
         }
         return money;
     }
}
