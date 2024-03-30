import java.time.LocalDate;
import java.time.Period;

public class student2 {
    private String name;
    private LocalDate dateOfBirth;

    public student2(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayStudentAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        int years = age.getYears();
        System.out.println("Student Age: " + years + " years");
    }

    public static void main(String[] args) {
        // Example usage
        LocalDate dob = LocalDate.of(2000, 5, 15); // Example date of birth (YYYY, MM, DD)
        student2 student = new student2("John Doe", dob);
        student.displayStudentName();
        student.displayStudentAge();
    }
}

