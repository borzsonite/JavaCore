package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;

public class Test3_composition {

    static class Computer {
        Hdd hdd;
        Mouse mouse ;
        Monitor monitor;

        public Computer(Hdd hdd, Mouse mouse, Monitor monitor) {
            this.hdd = hdd;
            this.mouse = mouse;
            this.monitor = monitor;
        }

        public static void main(String[] args) {
            Computer computer = new Computer(new Hdd("Seagate"), new Mouse("Logitech"), new Monitor("LG"));
            System.out.println(computer.hdd);
            System.out.println(computer.mouse);
            System.out.println(computer.monitor);
        }


    }

    static class Hdd {
        String manufactor;

        public Hdd(String manufactor) {
            this.manufactor = manufactor;
        }

        @Override
        public String toString() {
            return this.manufactor;
        }
    }

    static class   Mouse {
        String manufactor;

        public Mouse(String manufactor) {
            this.manufactor = manufactor;
        }

        @Override
        public String toString() {
            return this.manufactor;
        }

    }

    static class Monitor {
        String manufactor;

        public Monitor(String manufactor) {
            this.manufactor = manufactor;
        }

        @Override
        public String toString() {
            return this.manufactor;
        }

    }
}
