package com.mycompany.mavenbankaccount;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
 
    
    

    /**
     * Constructs a bank account with a zero balance
     */
    public BankAccount() {
        balance = 500;
        this.accountNumber = NEXTNUMBER++;
        
    }

    /**
     * Constructs a bank account with a given balance
     *
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
        
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Transfer from this to other
     *
     * @param amount the sum to be transferred
     * @param other other the account into which money is transferred
     */
    public void transfer(double amount, BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + " > " + balance;

    }

    private double balance;
    private int accountNumber;
    static int NEXTNUMBER = 1;
}
