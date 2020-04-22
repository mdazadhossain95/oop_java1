import java.util.ArrayList;
import java.util.Scanner;

public class autoboxing_and_unboxing_challenge {

    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions


    static class Bank {
        private String name;
        private ArrayList<Branch> branches;

        public Bank(String name) {
            this.name = name;
            this.branches = new ArrayList<Branch>();
        }

        public boolean addBranch(String branchName) {
            if(findBranch(branchName) == null) {
                this.branches.add(new Branch(branchName));
                return true;
            }

            return false;
        }

        public boolean addCustomer(String branchName, String customerName, double initialAmount) {
            Branch branch = findBranch(branchName);
            if(branch != null) {
                return branch.newCustomer(customerName, initialAmount);
            }

            return false;
        }

        public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
            Branch branch = findBranch(branchName);
            if(branch != null) {
                return branch.addCustomerTransaction(customerName, amount);
            }

            return false;
        }

        private Branch findBranch(String branchName) {
            for(int i=0; i<this.branches.size(); i++) {
                Branch checkedBranch = this.branches.get(i);
                if(checkedBranch.getName().equals(branchName)) {
                    return checkedBranch;
                }
            }

            return null;
        }

        public boolean listCustomers(String branchName, boolean showTransactions) {
            Branch branch = findBranch(branchName);
            if(branch != null) {
                System.out.println("Customer details for branch " + branch.getName());

                ArrayList<Customer> branchCustomers = branch.getCustomers();
                for(int i=0; i<branchCustomers.size(); i++) {
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                    if(showTransactions) {
                        System.out.println("Transactions");
                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                        for(int j=0; j<transactions.size(); j++) {
                            System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

//================================================================================================================

    static class Branch {
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<Customer>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public boolean newCustomer(String customerName, double initialAmount) {
            if(findCustomer(customerName) == null) {
                this.customers.add(new Customer(customerName, initialAmount));
                return true;
            }

            return false;
        }

        public boolean addCustomerTransaction(String customerName, double amount) {
            Customer existingCustomer = findCustomer(customerName);
            if(existingCustomer != null) {
                existingCustomer.addTransaction(amount);
                return true;
            }

            return false;
        }

        private Customer findCustomer(String customerName) {
            for(int i=0; i<this.customers.size(); i++) {
                Customer checkedCustomer = this.customers.get(i);
                if(checkedCustomer.getName().equals(customerName)) {
                    return checkedCustomer;
                }
            }

            return null;
        }
    }

//============================================================================================================

    static class Customer {
        private String name;
        private ArrayList<Double> transactions;

        public Customer(String name, double initialAmount) {
            this.name = name;
            this.transactions = new ArrayList<Double>();
            addTransaction(initialAmount);
        }

        public void addTransaction(double amount) {
            this.transactions.add(amount);
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }
    }


//============================================================================================================


    public static void main(String[] args) {

        Bank bank = new Bank("bangladesh Bank ltd. ");

        if(bank.addBranch("Chittagong")) {
            System.out.println("Chittagong branch created");
        }

        bank.addCustomer("Chittagong", "Azad", 50.05);
        bank.addCustomer("Chittagong", "Hossain", 175.34);
        bank.addCustomer("Chittagong", "avi", 220.12);

        bank.addBranch("Dhaka");
        bank.addCustomer("Dhaka", "jiku", 150.54);

        bank.addCustomerTransaction("Chittagong", "Azad", 44.22);
        bank.addCustomerTransaction("Chittagong", "Azad", 12.44);
        bank.addCustomerTransaction("Chittagong", "Hossain", 1.65);

        bank.listCustomers("Chittagong", true);
        bank.listCustomers("Dhaka", true);

        bank.addBranch("Kumilla");

        if(!bank.addCustomer("Kumilla", "raian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Chittagong")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Chittagong", "arju", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Chittagong", "Azad", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}