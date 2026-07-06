class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(
            String userName,
            int amount
    ) {

        System.out.println(
                userName
                        + " wants to withdraw: "
                        + amount
        );

        if (balance >= amount) {

            System.out.println(
                    userName
                            + " is processing withdrawal..."
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            balance = balance - amount;

            System.out.println(
                    userName
                            + " withdrawal successful"
            );

            System.out.println(
                    "Remaining Balance: " + balance
            );

        } else {

            System.out.println(
                    userName
                            + " withdrawal failed"
                            + " due to insufficient balance"
            );
        }

        System.out.println("--------------------");
    }
}

public class BankAccountThread {

    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(
                () -> account.withdraw("User-1", 700)
        );

        Thread t2 = new Thread(
                () -> account.withdraw("User-2", 500)
        );

        Thread t3 = new Thread(
                () -> account.withdraw("User-3", 300)
        );

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All transactions completed");
    }
}