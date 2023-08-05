import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/*public class Student {
    private int registrationNumber;
    private String name;
    private LocalDate dateOfBirth;
    private String[] courses = new String[3];

    public Student(int registrationNumber, String name, LocalDate dateOfBirth, String[] courses) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        if (courses != null) {
            for (int i = 0; i < courses.length && i < 3; i++) {
                this.courses[i] = courses[i];
            }
        }
    }

    public Student(int registrationNumber, String name, LocalDate dateOfBirth) {
        this(registrationNumber, name, dateOfBirth, null);
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        if (courses != null) {
            for (int i = 0; i < courses.length && i < 3; i++) {
                this.courses[i] = courses[i];
            }
        }
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int age = now.getYear() - dateOfBirth.getYear();
        if (now.getDayOfYear() < dateOfBirth.getDayOfYear()) {
            age--;
        }
        return age;
    }
}
*/
public class StudentsData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration number: ");
            int registrationNumber = Integer.parseInt(reader.readLine());

            System.out.print("Name: ");
            String name = reader.readLine();

            System.out.print("Date of birth (YYYY-MM-DD): ");
            LocalDate dateOfBirth = LocalDate.parse(reader.readLine());

            System.out.print("Courses (comma-separated, up to 3): ");
            String[] courses = reader.readLine().split(",");
            
            students[i] = new Student(registrationNumber, name, dateOfBirth, courses);
        }

        System.out.println("\nStudent Details\n");
        System.out.printf("%-20s %-20s %-10s\n", "Registration No.", "Name", "Age");
        for (Student student : students) {
            System.out.printf("%-20d %-20s %-10d\n", student.getRegistrationNumber(), student.getName(), student.getAge());
        }
    }

}
