package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void main(String[] args) {

        Consumer<String> print0 = new Consumer<String>() { //вариант 1
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        print0.accept("Hello from annonimous");

        // ссылка на метод

        Consumer<String> print1 = s -> System.out.println(s); // вариант 2
        print1.accept("Hello from lambda");

        Consumer<String> print2 = System.out::println; //вариант 3. print1 это ссылка на метод println (в данном случае не статический)
        print2.accept("Hello from link to methold");

        ///////////////////передача сылки на статический метод/////////////////////
        Consumer<String> print3 = MethodReferenceExample::myPrintln;
        print3.accept("another lins hello");

        //////////////////Передача ссылки на конструктор///////////////////////
        Database database = User::new;
        User user = database.create("Simon", "root");
        System.out.println("User:" + user.getName() + " Password:"+ user.getPassword());

    }

    static void myPrintln(String s) {  // статический метод
        System.out.println(s);
    }



}

interface Database {
    User create(String name, String password);
}

class User {
    String name, password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

