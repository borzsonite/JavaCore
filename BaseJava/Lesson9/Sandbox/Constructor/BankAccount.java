package BaseJava.Lesson9.Sandbox.Constructor;

import java.time.LocalDateTime;

class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    public BankAccount() {
        this("", LocalDateTime.now(), 0.0d);
    }

    public BankAccount(BankAccount account) {
        this(account.name, LocalDateTime.now(), 0.0f);
    }

    public BankAccount(String name) {
        this(name, LocalDateTime.now(), 0.0f);
    }

    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f",
                name, opened.toString(), balance);
    }
}