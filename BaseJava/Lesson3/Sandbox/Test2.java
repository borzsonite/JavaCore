package BaseJava.Lesson3.Sandbox;

abstract class Test2 {
    public abstract int getX();
    public abstract int getY();
    public double getLength() {
        return Math.sqrt(getX()*getX()+
                getY()*getY());
    }
}

class Child extends Test2 {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getLength());
    }

    @Override
    public int getX() {
        return 2;
    }

    @Override
    public int getY() {
        return 3;
    }
}


