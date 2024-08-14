package com.example.oops;

/**
 * Abstraction is a process of hiding implementation and showing only functionality to
 * the user. We can achieve abstraction in two ways either by abstract class and by interface
 */
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//    abstract method
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

//    non-abstract method
    public void displayBalance() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

/**
 * after depositing amount the balance gets added to the current balance
 *
 * and method overriding also done
 */
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("New balance: " + balance);
    }

/**
 * Withdraw of amount is performed and if the balance is present more than the required amount
 * then amount gets withdrawn otherwise it throws an exception as insufficient balance
 */
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount + " from savings account");
        } else {
            throw new RuntimeException("Insufficient balance");
        }
    }
    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added to Savings Account.");
    }
}

/**
 * We can check balance if amount is withdrawn then we get exception as overdraft limit exceeded
 */
class CheckBalance extends BankAccount {

    private double overdraftLimit;

    public CheckBalance(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("New balance: " + balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance+overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount + " by checking account");
        } else  {
            throw new RuntimeException("Overdraft limit exceeded");
        }
    }

    public void overdraftLimit() {
        balance += balance * overdraftLimit;
        System.out.println("Overdraft limit: " + balance);
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount("Savings Account", 100.00, 0.5);
        BankAccount checkAccount = new CheckBalance("Check Balance", 100.00, 0.5);

//        bankAccount.deposit(500);
//        bankAccount.withdraw(600);
//        bankAccount.withdraw(200);
//        ((SavingsAccount)bankAccount).addInterest();
//        bankAccount.displayBalance();

        checkAccount.deposit(500);
        checkAccount.withdraw(300);
//        checkAccount.withdraw(400);
        ((CheckBalance)checkAccount).overdraftLimit();
        checkAccount.displayBalance();

    }
}
