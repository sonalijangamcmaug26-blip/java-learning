/* exception class
    parent class
    saving rule for balance < 500
    current rule for balance 0
    for accessing concept of polymorphism
 */

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }

}

class Account {
    private int accountNumber;
    private double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");
        };
        balance = balance - amount;
    }

}

class SavingsAccount extends Account {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override 
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(getBalance() - amount < 500){
            throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");
        };
        setBalance(getBalance() - amount);
    }

}

class CurrentAccount extends Account {
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override 

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > getBalance()){

            throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");   
        };
        setBalance(getBalance() - amount);
    }
}

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the type of account ");
        String accountType = sc.next();
        System.out.println("enter account number");
        int accountNumber = sc.nextInt();
        System.out.println("enter your balance");
        double balance = sc.nextDouble();
        System.out.println("enter the amount to be withdrawn");
        double withdrawAmount = sc.nextDouble();

        Account account;

        if(accountType.equalsIgnoreCase("savings")){
            account = new SavingsAccount(accountNumber, balance);
        }
        else {
            account = new CurrentAccount(accountNumber, balance);
        }

        try{
            account.withdraw(withdrawAmount);
                System.out.println("withdrawl successful");
                System.out.println("Remaining balance : " + (int)account.getBalance());
            
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}