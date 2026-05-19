
package theproject.SRMS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        new AutoSaveThread(manager).start();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SRMS Qassim University ---");
            System.out.println("1. Add Student\n2. Show All\n3. Generate Report\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                if (choice == 1) {
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("GPA: "); double gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Dept: "); String dept = sc.nextLine();
                    System.out.print("City: "); String city = sc.nextLine();
                    
                    manager.addStudent(new Student(name, 20, id, gpa, dept, new Address(city, "Street")));
                } else if (choice == 2) {
                    manager.getStudents().forEach(s -> System.out.println(s.getDetails()));
                } else if (choice == 3) {
                    Thread reportThread = new Thread(new ReportGenerator(manager));
                    reportThread.start();
                } else if (choice == 4) {
                    FileHandler.saveToFile(manager.getStudents());
                    System.exit(0);
                }
            } catch (InvalidStudentDataEx e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

