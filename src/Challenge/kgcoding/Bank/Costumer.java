package Challenge.kgcoding.Bank;

public class Costumer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("021","Sohail Khan");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(244));
        account.withdrawMoney(-33);
        account.depositMoney(0);


    }
}
