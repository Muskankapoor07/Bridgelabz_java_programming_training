class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(
            String message) {

        super(message);
    }
}

class BankAccount {

    double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal Successful");

        System.out.println(
                "Remaining Balance: "
                        + balance);
    }
}

public class BankingApplication {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount();

        try {

            account.withdraw(7000);

        } catch(
                InsufficientBalanceException e) {

            System.out.println(
                    e.getMessage());

        } finally {

            System.out.println(
                    "Transaction Completed");
        }
    }
}