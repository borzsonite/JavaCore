package BaseJava.Lesson9.Sandbox.Constructor;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        VipBankAccount vipAccount = new VipBankAccount("Thomas", "VIP");
        System.out.println(vipAccount);
    }
}