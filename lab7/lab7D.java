class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized boolean withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw " + amount + "...");
        
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            balance -= amount;
            System.out.println(user + " successfully withdrew " + amount + ". Remaining balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance! " + user + "'s withdrawal failed.");
            return false;
        }
    }
}

class WithdrawalTask implements Runnable {
    BankAccount account;
    String user;
    int amount;

    public WithdrawalTask(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(user, amount);
    }
}

public class lab7D {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        
        Thread user1 = new Thread(new WithdrawalTask(account, "User 1", 4000));
        Thread user2 = new Thread(new WithdrawalTask(account, "User 2", 2000));
        
        user1.start();
        user2.start();
        
        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}