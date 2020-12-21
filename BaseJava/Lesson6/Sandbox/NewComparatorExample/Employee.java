package BaseJava.Lesson6.Sandbox.NewComparatorExample;

import java.util.*;

public class Employee {
    String name;
    int age;
    double salary;
    long mobile;

    public Employee(String name, int age, double salary, long mobile) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", mobile=" + mobile +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 25, 3000.0, 9922001));
        list.add(new Employee("John", 20, 3000.0, 9922001));
        list.add(new Employee("Ace", 22, 2000.0, 5924001));
        list.add(new Employee("Keith", 35, 4000.0, 3924401));

        //Создание компаратора для сортировки по двум полям (name, age)
        Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getAge);
        System.out.println(list);
        Collections.sort(list, employeeNameComparator);
        System.out.println(list);

        //Задание собственного порядка сортировки
        Comparator<Employee> descendingOrderByName = Comparator.comparing(Employee::getName, (s1,s2)-> {
            return s2.compareTo(s1);
        });
        Collections.sort(list, descendingOrderByName);
        System.out.println(list);
    }




}
