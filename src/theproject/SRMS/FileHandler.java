
package theproject.SRMS;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "students.txt";

    public static void saveToFile(List<Student> students) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.println(s.toString());
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public static List<Student> loadFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Address addr = new Address(parts[5], parts[6]);
                students.add(new Student(parts[1], Integer.parseInt(parts[2]), parts[0], 
                        Double.parseDouble(parts[3]), parts[4], addr));
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
        }
        return students;
    }
}
