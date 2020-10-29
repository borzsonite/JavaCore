package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox.Клонирование;
import java.io.*;
public class BasketCats {


    static class Cat implements Serializable{
        private String name;
        private String color;
        private int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Cat vaska = new Cat("Vaska","Gray",4);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //поток вывода записывающий байты в массив
            ObjectOutputStream ous = new ObjectOutputStream(baos); // поток вывода объектов
            //сохраняем состояние кота Васьки в поток и закрываем его(поток)
            ous.writeObject(vaska);
            ous.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            //создаём кота для опытов и инициализируем его состояние Васькиным
            Cat cloneVaska = (Cat)ois.readObject();
            System.out.println(vaska);
            System.out.println(cloneVaska);
            System.out.println("*********************************************");
            cloneVaska.setColor("Black");
            //Убеждаемся что у кота Васьки теперь есть клон, над которым можно ставить опыты без ущерба Василию
            System.out.println(vaska);
            System.out.println(cloneVaska);

        }

}
