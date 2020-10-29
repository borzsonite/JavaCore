package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Tkach.Bound;

public class Camera extends Product implements Comparable<Camera>{
    private String model;

    @Override
    public int compareTo(Camera o) {
        return 0;
    }
}
