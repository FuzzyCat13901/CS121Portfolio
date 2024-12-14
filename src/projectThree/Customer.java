package projectThree;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPin() {
        return pin;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean removeAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                System.out.println("Account " + accountNumber + " has been closed.");
                return true;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
        return false;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public String getAllAccountsInfo() {
        StringBuilder info = new StringBuilder();
        for (Account account : accounts) {
            info.append(account.toString()).append("\n");
        }
        return info.toString();
    }

    @Override
    public String toString() {
        // ok tangent, one thing I love about Java compared to C is actually good string syntax. I hate strncpy()'ing everything this is so awesome
        return "Customer: " + firstName + " " + lastName + ", PIN: " + pin;
    }
}