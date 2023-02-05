// Creation of Account Class to be used in TestAccount.
// Completed by: Darla Ward
// Completed on February 4, 2023

package utils;
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Takes amount parameter and adds it to the starting balance.
    public int credit(int amount){
        balance += amount;
        return balance;
    }

    // Takes amount parameter and subtracts it from the starting balance.
    // If amount is greater than the balance, a statement will be printed.
    public int debit(int amount){
        if (amount <= balance){
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Takes amount and destinationAccount parameters. If amount is greater than the balance funds will be taken from,
    // a statement will be printed, otherwise it will first do the debit function on Account 1. Then it will do the credit
    // function on the destination Account.
    public int transferTo(int amount, Account destinationAccount){
        if (amount <= balance){
            this.debit(amount);
            destinationAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}