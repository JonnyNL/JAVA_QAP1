public class TestAccount {
    public static void main(String[] args) {
        
        // Acc1 with balance of $5000 and Acc2 with balance of $4000 by using parameterised constructors defined in Account class.
        Account Acc1 = new Account("1", "", 5000);
        Account Acc2 = new Account("2", "", 4000);


        // Display balance of both account using getBalance() method
        System.out.println("Account 1 Balance: $" + Acc1.getBalance());
        System.out.println("Account 2 Balance: $" + Acc2.getBalance());


        // Transfer $1000.00 from account 1 to account 2
        Acc1.transferTo(Acc2, 1000);

        // Display balance of both accounts
        System.out.println("\nv After the transfer v\n");
        System.out.println("Account 1 Balance: $" + Acc1.getBalance());
        System.out.println("Account 2 Balance: $" + Acc2.getBalance());
    }
}
