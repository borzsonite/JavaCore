package BaseJava.Lesson9.Sandbox.Constructor;

import java.time.LocalDateTime;

public class VipBankAccount extends BankAccount {
    String status;

    public VipBankAccount(String name, String status) {
        super(name, LocalDateTime.now(), 0.0f);
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f \nСтатус: %s",
                name, opened.toString(), balance, status);
    }
}
