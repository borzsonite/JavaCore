package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;

public class ConstructorSuper {
    int id;
    String name;

    public ConstructorSuper(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        SuperChild superChild = new SuperChild(1, "toyota");
        System.out.println(superChild);
    }
}

class SuperChild extends ConstructorSuper {
    String model;

    public SuperChild(int i, String model) {
        super(i, model);
    }
//    public SuperChild(int id, String name, String model) {
//        super(id, name);
//        this.model = model;
//    }

    @Override
    public String toString() {
        return "SuperChild{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
