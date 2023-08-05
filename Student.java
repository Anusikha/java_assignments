import java.time.LocalDate;

public class Student {
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
