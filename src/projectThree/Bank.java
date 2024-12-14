package projectThree;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //I know this is basic for a programming languge to have it
    //But I like how like Objective-C, Java lets you type specify arrays/lists
    //Go didn't until recently though for some reason lmao

    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getFirstName() + " " + customer.getLastName() + " added to the bank.");
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        System.out.println("Customer " + customer.getFirstName() + " " + customer.getLastName() + " removed from the bank.");
    }

    public Customer getCustomerByPin(String pin) {
        for (Customer customer : customers) {
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        }
        return null;
    }

    public String getAllCustomersInfo() {
        StringBuilder info = new StringBuilder();
        for (Customer customer : customers) {
            info.append(customer.toString()).append("\n");
        }
        return info.toString();
    }
}
