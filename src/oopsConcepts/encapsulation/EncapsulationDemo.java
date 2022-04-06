package oopsConcepts.encapsulation;

public class EncapsulationDemo {
    //we have to create variable private for encapsulation
    //Note: we can create constructor for give value by the object
    //properties for encapsulation
    private String name;
    private int id_no;
    private String department;

   //we will provide now getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
