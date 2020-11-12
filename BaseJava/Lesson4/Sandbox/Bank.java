package BaseJava.Lesson4.Sandbox;

public class Bank {

    public static void main(String [] args) {
        Checking c = new Checking(101);
        System.out.println("Депозит $300...");
        c.deposit(300.00);

        try {
            System.out.println("\nСнятие $100...");
            c.withdraw(100.00);
            System.out.println("\nСнятие $400...");
            c.withdraw(400.00);
        }catch(InsufficientFundsException e) {
            System.out.println("Извините, но у Вас $" + e.getAmount());
            e.printStackTrace();
        }
    }
}

class Checking {
    private int number;
    private double balance;

    public Checking(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}

class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}