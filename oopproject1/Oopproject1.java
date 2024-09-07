
package oopproject1;


public class Oopproject1 {

    
    public static void main(String[] args) {
       BankAccount account1 = new  BankAccount("ABC",100.0);
       System.out.println("account_ID:" + account1.getAccount_ID());
       System.out.println("Balance:" + account1.getBalance());
       account1.deposit(50.0);
       System.out.println("Balance after deposit :" + account1.getBalance());
       account1.withdraw(60);
       System.out.println("Balance after deposit :" + account1.getBalance());
    }
    
}
