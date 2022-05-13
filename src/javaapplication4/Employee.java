package javaapplication4;

public class Employee {

    int id;
    String name;
    String depart;
    double salary;
    double bonus;
    boolean resident;

    public void print() {
        System.out.println("id" + " : " + id);
        System.out.println("name" + " : " + name);
        System.out.println("depart" + " : " + depart);
        System.out.println("salary" + " : " + salary);
        System.out.println("bonus" + " : " + bonus);
        System.out.println("resident" + " : " + resident);
    }

    public Employee(int id, String name, String depart, double salary, double bonus, boolean resident) {
        this.id = id;
        this.name = name;
        this.depart = depart;
        this.salary = salary;
        this.bonus = bonus;
        this.resident = resident;
    }

    public Employee() {
        id = 100;
        name = "no name";
        depart = "no assiqned yet";
        salary = 3000;
        bonus = 500;
        resident = true ;
    }

}
