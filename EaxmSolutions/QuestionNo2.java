import java.util.Scanner; 
 
class Account{ 
    private int accountNumber; 
    private double balance; 
    private String accountType; 
    private double withdrawAmount; 
 
    Account(int accountNumber, double balance,String accountType, double withdrawAmount){ 
        this.accountNumber = accountNumber; 
        this.balance = balance; 
        this.accountType = accountType; 
        this.withdrawAmount = withdrawAmount; 
    } 
 
    public int getAccountNumber(){ 
        return accountNumber; 
    } 
    public int setAccountNumber(int accountNumber){ 
        return accountNumber; 
    } 
 
    public double getBalance(){ 
        return balance; 
    } 
 
    public double setBalance(double balance){ 
        return balance; 
    } 
 
    public String getAccountType(){ 
        return getAccountType(); 
    } 
    public String setAccountType(String accountType){ 
        return accountType; 
    } 
 
    public double getWithdrawamount(){ 
        return withdrawAmount; 
    } 
 
    public double setWithdrawamount(double withdrawAmount){ 
        return withdrawAmount; 
    } 
 
    public double withdraw(double withdrawAmount){ 
        return balance = balance - withdrawAmount; 
    } 
} 
 
class SavingsAccount extends Account { 
 
    private double savingbalance; 
 
    SavingsAccount(double savingbalance) 
    { 
        this.savingbalance = savingbalance; 
    } 
 
    public double getBalance(){ 
        return savingbalance; 
    } 
 
    public double setBalance(double balance){ 
        return savingbalance; 
    } 
 
    public double withdraw(double withdrawAmount){ 
        return savingbalance = savingbalance - withdrawAmount; 
    } 
     
 
    try{ 
        if(savingbalance < 500){ 
            System.out.println("Withdrawal denied due to insufficient balance"); 
        } 
 
    } 
    catch(Exception e){ 
        System.out.println("InsufficientBalanceException" + e.getMessage()); 
    } 
     
} 
 
class CurrentAccount extends Account { 
 
    private double currentbalance; 
 
    CurrentAccount(double currentbalance){ 
        this.currentbalance = currentbalance; 
    } 
 
     public double getBalance(){ 
        return currentbalance; 
    } 
 
    public double setBalance(double balance){ 
        return currentbalance; 
    } 
 
    public double withdraw(double withdrawAmount){ 
        return currentbalance = currentbalance - withdrawAmount; 
    } 
 
    try{ 
        if(currentbalance == 0){ 
            System.out.println("Withdrawal denied due to insufficient balance"); 
        } 
 
    } 
    catch(Exception e){ 
        System.out.println("InsufficientBalanceException" + e.getMessage()); 
 
    } 
 
} 
 
public class QuestionNo2{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int accountNumber = sc.nextInt(); 
        double balance = sc.nextDouble(); 
        String accountType = sc.next(); 
        double withdrawAmount = sc.nextDouble(); 
        double savingbalance = sc.nextDouble(); 
        double currentbalance = sc.nextDouble(); 
 
        Account acc1 = new SavingsAccount(10000); 
        acc1.getAccountType(); 
        acc1.getAccountNumber(); 
        acc1.getBalance(); 
        acc1.getWithdrawamount(); 
        System.out.println("withdrawl successful"); 
 
        Account acc2 = new CurrentAccount(20000); 
        acc2.getAccountType(); 
        acc2.getAccountNumber(); 
        acc2.getBalance(); 
        acc2.getWithdrawamount(); 
 
         
    } 
}