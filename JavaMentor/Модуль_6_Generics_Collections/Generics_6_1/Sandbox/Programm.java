package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

public class Programm {
    public static void main(String[] args) {

        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());

        Account<Integer> acc3 = new Account<>(5, 100);
        Account<String> acc4 = new Account<>("sid15", 1000);
    }
}
class Account <T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

   // private T item = new T(); Так нельзя, т.к. неизвестно какого типа Т

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
