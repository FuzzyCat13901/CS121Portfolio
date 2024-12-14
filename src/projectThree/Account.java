package projectThree;

public class Account {
    private static int numberOfAccounts = 1000; //i start numberOfAccounts at 1000 because it's a simple number and makes it easy to tell if you created 10 accounts by seeing 1010. Why not 0? I don't know lol I just felt like it
    private int accountNumber;
    private double balance;

    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        numberOfAccounts += 1;
        this.accountNumber = numberOfAccounts;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Updated Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal of $" + amount + " failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Updated Balance: $" + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}