class Account {
    protected String acc_number;
    protected double acc_balance;

    public void deposit(double amount) {
        if (amount > 0) {
            acc_balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && acc_balance >= amount) {
            acc_balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + acc_number + " | Balance: " + acc_balance);
    }
}

class Savings_Acc extends Account {
    private static final double MIN_BALANCE = 1000;
    private double interest;

    public Savings_Acc(String a, double b, double c) {
        acc_number = a;
        acc_balance = b;
        interest = c;
    }

    public void calculateInterest() {
        double interestAmount = acc_balance * (interest / 100);
        acc_balance += interestAmount;
        System.out.println("Interest added: " + interestAmount);
    }

    @Override
    public void withdraw(double amount) {
        if (acc_balance - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Balance would drop below the minimum balance.");
        }
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Interest Rate: " + interest + "% | Minimum Balance: " + MIN_BALANCE);
    }
}

class Current_Acc extends Account {
    private double overdraftLimit;

    public Current_Acc(String m, double n, double o) {
        acc_number = m;
        acc_balance = n;
        overdraftLimit = o;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (acc_balance + overdraftLimit) >= amount) {
            acc_balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class Customercare {
    public static void main(String[] args) {
        Savings_Acc savings = new Savings_Acc("SA123", 5000, 5);
        savings.deposit(1000);
        savings.withdraw(2000); // This will not violate minimum balance
        savings.calculateInterest();
        savings.displayBalance();

        Current_Acc current = new Current_Acc("CA456", 3000, 5000);
        current.deposit(2000);
        current.withdraw(6000); // This should allow overdraft
        current.displayBalance();
    }
}
