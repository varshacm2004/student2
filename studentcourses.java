import java.util.HashMap;
import java.util.Map;

public class studentcourses {
    private int semesterNumber;
    private Map<String, Integer> courseMarks;

    public studentcourses(int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.courseMarks = new HashMap<>();
    }

    public void addCourseMark(String courseName, int marks) {
        courseMarks.put(courseName, marks);
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester " + semesterNumber + " Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example usage
        studentcourses semester1 = new studentcourses(1);
        semester1.addCourseMark("Mathematics", 90);
        semester1.addCourseMark("Physics", 85);

    }
}
