// Custom Exception for Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Your balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            // Trying to withdraw more than the available balance
            account.withdraw(600.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            // Trying to withdraw a valid amount
            account.withdraw(200.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
