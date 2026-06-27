public class Main {

    public static void main(String[] args) {

        // Initial balance = ₹10000
        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.start();
    }
}