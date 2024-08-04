import java.util.Scanner;

class Bank_Account {
    String Account_holder_name;
    int Account_number;
    String Account_type;
    int s = 0; // s for savings balance
    int c = 0; // c for current balance (not used in your methods)

    public void withdraw_money() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current savings balance: " + s);
        System.out.println("Enter amount to withdraw:");
        int amt = sc.nextInt();
        if (amt > s) {
            System.out.println("Insufficient balance!");
        } else {
            s -= amt;
            System.out.println("Withdrawal successful. New savings balance: " + s);
        }
    }

    public void deposit_money() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current savings balance: " + s);
        System.out.println("Enter amount to deposit:");
        int amt = sc.nextInt();
        s += amt;
        System.out.println("Deposit successful. New savings balance: " + s);
    }
}

public class Bank {
    public static void main(String args[]) {
        Bank_Account ob1 = new Bank_Account();
        Scanner give = new Scanner(System.in);
        System.out.println("If you want to withdraw money, type 1. If you want to deposit, type 2:");
        int ch = give.nextInt();

        if (ch == 1) {
            ob1.withdraw_money();
        } else if (ch == 2) {
            ob1.deposit_money();
        } else {
            System.out.println("Invalid choice!");
        }

        give.close();
    }
}
