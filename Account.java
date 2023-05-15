public class Account {

    // Base constructor for Accounts
    private String id;
    private String name;
    private int balance = 0;

    // Account constructor with given id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Account constructor with given id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // a method that returns the account id
    public String getID() {
        return id;
    }

    // a method that returns the account name
    public String getName() {
        return name;
    }

    // a method that returns the account balance
    public int getBalance() {
        return balance;
    }

    // a method that adds credit to an account balance
    public int credit(int amount) {
        this.balance = amount + balance;
        return balance;
    }

    // a method that debits an amount from account balance and returns balance
    public int debit(int amount) {
        // Check to make sure there is enough balance for deduction
        if (amount <= balance) {
            this.balance = balance - amount;
        } else {System.out.println("Amount exceeded balance");} // If amount exceeds balance display message

        return balance;
    }

    // a method that transfers balance from one account to another
    public int transferTo(Account another, int amount) {
        // make sure there is enough balance for transfer
        if (amount <= balance) {
            // Subtract transfer amount from transferrer
            this.balance = balance - amount;
            // set other account balance as updated balance
            another.balance = another.balance + amount;
        } else {
            System.out.println("Amount exceeded balance"); // If amount exceeds balance display message
        } return balance;
    }


    // a method that returns the account info in string format
    public String toString() {
        return("Account[id=" + id + ",name=" + name + ",balance=" + balance);
    }

}