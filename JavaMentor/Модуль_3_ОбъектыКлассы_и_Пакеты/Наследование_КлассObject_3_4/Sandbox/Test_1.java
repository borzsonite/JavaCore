package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;

/**
 * Created by Alpha on 07.09.2020.
 */
public class Test_1 {
    public static void main(String[] args) {

        Animal a1 = new Animal(1);
        Animal a2 = new Animal(1);
        System.out.println(a1.equals(a2));

        BlackBox b1 = new BlackBox(5, 3);
        BlackBox b2 = new BlackBox(5, 3);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(Double.compare(0.00001, 0.001));
        System.out.println(a1.hashCode());



    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

   public boolean equals(Object obj) {
       Animal that = (Animal)obj;
       return that.id == id;
   }
}

class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BlackBox other = (BlackBox) obj;
        if (varA != other.varA)
            return false;
        if (varB != other.varB)
            return false;
        return true;
    }
}


