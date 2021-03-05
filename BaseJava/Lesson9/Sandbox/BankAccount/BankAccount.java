package BaseJava.Lesson9.Sandbox.BankAccount;

import java.time.LocalDateTime;
import java.time.Month;

class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    public BankAccount(BankAccount account) {
        name = account.name;
        opened = LocalDateTime.now();
        balance = 0.0f;
    }

    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f ",
                name, opened.toString(), balance);
    }
}

 class Main {
    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(1986, Month.MAY, 30, 4, 30, 0);
        BankAccount account = new BankAccount("Tom", opened, 12_642.0f);
        BankAccount newAccount = new BankAccount(account);

        System.out.println("Имя владельца для счета account = " + account.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.name);
        System.out.println("\nРезультат выполнения кода после изменения имени владельца счета \n");

        account.name = "Thomas";

        System.out.println("Имя владельца для счета account = " + account.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.name);
    }
}
