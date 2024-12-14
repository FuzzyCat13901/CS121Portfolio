package projectThree;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Bank bank;

    public Menu() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }

    public void runMenu() {
        while (true) {
            System.out.printf("\n********* MENU *********\n\nPlease make a selection:");
            System.out.println("1. Access an Account");
            System.out.println("2. Open a New Account");
            System.out.println("3. Close All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    accessAccount();
                    break;
                case 2:
                    openNewAccount();
                    break;
                case 3:
                    closeAllAccounts();
                    break;
                case 4:
                    System.out.println("Thank you for using the BSU Banking App");
                    System.out.println("Goodbye. Exiting...");
                    System.exit(0); //java has exit() yay
                default:
                    System.out.println("Invalid entry, please try again.");
            }
        }
    }

    private void accessAccount() {
        System.out.print("Please enter your PIN: ");
        String pin = scanner.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("PIN is invalid.");
            return;
        }

        System.out.println("***Active Accounts***");
        System.out.println(customer.getAllAccountsInfo());

        System.out.print("Enter the account number you want to access: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        Account account = customer.getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account number invalid.");
            return;
        }

        accountMenu(account);
    }

    private void accountMenu(Account account) {
        while (true) {
            System.out.println("\nAccount Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Account balance: $" + account.getBalance());
                    break;
                case 4:
                    // go back to main menu
                    return;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
        }
    }

    private void openNewAccount() {
        System.out.printf("Are you a new customer?\n1) Yes\n2) No\n");
        String response = scanner.nextLine().toLowerCase();

        Customer customer = null;
        //i should probably compare ints instead of numbers as strings but eh this works
        if (response.equals("1")) {
            customer = createNewCustomer();
        } else if (response.equals("2")) {
            System.out.print("Please enter PIN: ");
            String pin = scanner.nextLine();
            customer = bank.getCustomerByPin(pin);
            if (customer == null) {
                System.out.println("PIN is invalid.");
                return;
            }
        } else {
            System.out.println("Invalid response. Returning to Main Menu.");
            return;
        }

        System.out.print("Please enter deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); //not going to lie, scanner.nextDouble didnt work so I just tried random stuff and found out this is needed. i dont know why but o well

        Account newAccount = new Account(initialDeposit);
        customer.addAccount(newAccount);

        System.out.println("New Account Opened: " + newAccount.toString());
    }

    private Customer createNewCustomer() {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter a 4 digit PIN: ");
        String pin = scanner.nextLine();

        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);
        return newCustomer;
    }

    private void closeAllAccounts() {
        System.out.print("Please enter your PIN: ");
        String pin = scanner.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) { //I do like Java but one thing I miss from C is you can just do if (!customer) to check for NULL
            System.out.println("PIN is invalid.");
            return;
        }

        bank.removeCustomer(customer);
        System.out.println("You have been removed from the bank registry.");
    }
}