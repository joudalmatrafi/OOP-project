
package theproject.SRMS;
import java.io.Serializable;

public class Student extends Person implements Serializable {
 private String id;
private double gpa;
private String department;
private Address address;

    public Student(String name, int age, String id, double gpa, String department, Address address) {
    super(name, age);
    this.id = id;
    this.gpa = gpa;
    this.department = department;
    this.address = address;
}

    public String getId() { return id; }
    public double getGpa() { return gpa; }
    public String getDepartment() { return department; }

    @Override
    public String getDetails() {
        return String.format("ID: %s | Name: %s | GPA: %.2f | Dept: %s | Address: %s", 
                id, name, gpa, department, address);
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + gpa + "," + department + "," + address;
    }
}

