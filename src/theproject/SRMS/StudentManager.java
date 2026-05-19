
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

    public List<Student> getStudents() { return students; }
}

