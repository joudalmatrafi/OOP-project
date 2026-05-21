
package theproject.SRMS;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = FileHandler.loadFromFile();
    }

    public synchronized void addStudent(Student s) throws InvalidStudentDataEx {
        if (s.getGpa() < 0 || s.getGpa() > 4.0) throw new InvalidStudentDataEx("Invalid GPA!");
        students.add(s);
    }

    public synchronized boolean removeStudent(String id) {
        return students.removeIf(s -> s.getId().equals(id));
    }
public boolean updateStudent(String id, String name, int age, double gpa, String department, Address address) {
    for (Student s : students) {
        if (s.getId().equals(id)) {
            s.updateStudent(name, age, gpa, department, address);
            return true;
        }
    }
    return false;
}
    public List<Student> getStudents() { return students; }
}

