package BaseJava.Lesson7.Sandbox.CompositionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer computer0 = new Computer(new Ram(1024), new HDD(2048));
        Computer computer1 = new Computer(new Ram(1004), new HDD(2048));
        Computer computer2 = new Computer(new Ram(1032), new HDD(2048));
        Computer computer3 = new Computer(new Ram(1000), new HDD(2048));

        List<Computer> computerList = new ArrayList<>();
        computerList = Arrays.asList(computer0, computer1, computer2, computer3);
        System.out.println(computerList);


        System.out.println(computer0.toString());;

        ///////////////Comparator repeat///////////////
        //Comparator<Computer> computerComparator = Comparator.comparing(Computer::getRam);
    }
}
