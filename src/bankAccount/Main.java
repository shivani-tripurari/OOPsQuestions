package bankAccount;

class BankAccount{
    //has 2 fields : accountName, balance
    private String accountName;
    private double balance;
    //has 3 methods : deposit, withdraw, getBalance
    //deposit method
    public void deposit(double amount) {
        if(amount <= 0){
            throw new RuntimeException("Deposit amount cannot be 0.");
        }
        balance = balance+amount;
    }
    //withDraw method
    public void withdraw(double amount) {
        if(amount<=0){
            throw new RuntimeException("Withdraw amount cannot be 0.");
        }
        if(amount>this.balance){
            throw new RuntimeException("Insufficient balance");
        }
        balance = balance-amount;
    }
    //get account holder info
    public String getAccountName(){
        return accountName;
    }
    public double getBalance(){
        return balance;
    }

    //constructor -> called when object is first created
    //parameterized constructor because i will need both name and balance to create a bank account
    public BankAccount(String name, double amount) {
        if(amount<0){
            throw new RuntimeException("Initial amount cannot be 0.");
        }
        this.accountName = name;
        this.balance = amount;
    }
}

public class Main {
    public static void main(String args[]){
        //creating a new object with bankAccount.BankAccount class
        BankAccount acc1 = new BankAccount("Shivani Tripurari", 1000000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println(acc1.getAccountName());
        System.out.println(acc1.getBalance());
    }
}