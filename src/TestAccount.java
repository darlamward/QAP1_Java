// Creation of TestAccount to test the Account Class.
// Completed by: Darla Ward
// Completed on February 4, 2023

import utils.Account;

public class TestAccount {
    public static void main(String[] args) {

        // creating account details
        Account Acc1 = new Account("9001", "Darla Ward", 5000);
        Account Acc2 = new Account("9002", "Mike Ryan", 4000);

        // printing out account details
        System.out.println("Account 1 Details: " + Acc1.toString());
        System.out.println("Account 2 Details: " + Acc2.toString());

        // printing out starting balances for both accounts
        System.out.println("Account 1 Starting Balance: " + Acc1.getBalance());
        System.out.println("Account 2 Starting Balance: " + Acc2.getBalance());

        // transfer amount to second account
        Acc1.transferTo(1000, Acc2);

        // printing out ending balances after transfer of funds
        System.out.println("Account 1 Ending Balance: " + Acc1.getBalance());
        System.out.println("Account 2 Ending Balance: " + Acc2.getBalance());
    }
}