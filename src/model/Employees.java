package model;

public class Employees {
    String name;
    int salary;
    int id_no;

    public Employees(String name, int salary, int id_no) {
        this.name = name;
        this.salary = salary;
        this.id_no = id_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id_no=" + id_no +
                '}';
    }
}
