
package theproject.SRMS;
public class ReportGenerator implements Runnable {
    private StudentManager manager;

    public ReportGenerator(StudentManager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {
        System.out.println("\n--- Generating GPA Report ---");
        manager.getStudents().stream()
                .filter(s -> s.getGpa() >= 3.5)
                .forEach(s -> System.out.println("Honor Student: " + s.getDetails()));
    }
}

