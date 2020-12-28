package BaseJava.Lesson7.Sandbox.CompositionEx;

public class Computer implements Comparable<Computer> {
    private Ram ram;
    private HDD hdd;
    private int id;

    public Computer(Ram ram, HDD hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram.getValue() +
                ", hdd=" + hdd.getCapacity() +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return 0;
    }
}
