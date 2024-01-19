import java.util.ArrayList;

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " into " + accountHolder + "'s account. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from " + accountHolder + "'s account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal from " + accountHolder + "'s account.");
        }
    }
}

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(String accountHolder, double initialBalance) {
        Account newAccount = new Account(accountHolder, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created for " + accountHolder + " with initial balance: " + initialBalance);
    }

    public void removeAccount(String accountHolder) {
        accounts.removeIf(account -> account.getAccountHolder().equals(accountHolder));
        System.out.println("Account removed for " + accountHolder);
    }

    public void depositToAccount(String accountHolder, double amount) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equals(accountHolder)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found for deposit: " + accountHolder);
    }

    public void withdrawFromAccount(String accountHolder, double amount) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equals(accountHolder)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found for withdrawal: " + accountHolder);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount("John Doe", 1000.0);
        bank.addAccount("Alice Smith", 1500.0);

        bank.depositToAccount("John Doe", 200.0);
        bank.withdrawFromAccount("Alice Smith", 300.0);

        bank.removeAccount("John Doe");
    }
}