import java.util.Scanner;

class BankAccount {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    // Non-parameterized constructor
    BankAccount() {
        // Initialize the balance with a default value
        balance = 1000.0;
    }

    // Parameterized constructor to input details
    BankAccount(String name, long accno, String type) {
        customerName = name;
        accountNumber = accno;
        accountType = type;
        balance = 1000.0; // Default initial balance
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new account using the parameterized constructor
        BankAccount account = new BankAccount("Rattriz", 12209844L, "savings");

        int ch;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            ch = scanner.nextInt();

            switch (ch) {
                case 1: {
                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;
                }
                case 2: {
                    System.out.print("Enter withdrawal amount: ");
                    double with = scanner.nextDouble();
                    account.withdraw(with);
                    break;
                }
                case 3: {
                    account.displayAccountDetails();
                    break;
                }
                case 4: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
                }
            }
        } while (ch != 4);

        scanner.close();
    }
}
