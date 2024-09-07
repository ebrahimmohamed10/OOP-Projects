
package oopproject1;


public class BankAccount {
    private String account_ID;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String account_ID, double balance) {
        this.account_ID = account_ID;
        this.balance = balance;
    }

    public String getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(String account_ID) {
        this.account_ID = account_ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean withdraw(double amount)
    {
        if(balance>= amount)
        {
            balance = balance - amount;
            return true;
        }
            else
        {
            System.out.println("The balance is not sufficient.");
            return false;
        }
    }
    
    public boolean deposit(double amount)
        {
            if(amount >0)
        {
            balance = balance + amount;
            return true;
        }
            else
        {
            System.out.println("Try again");
            return false;
        }
        }
    
}
