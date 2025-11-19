import java.util.ArrayList;
import java.util.List;
public class StudentController {
    private List<Student> students;
    private StudentView view;

    public StudentController() {
        this.view = new StudentView();
    }

    public void addStudent(String nim, String nama) {
        students.add(new Student(nim, nama));
        view.showMessage("Student added: " + nama);
    }

    public void showAllStudents() {
        if (list.isEmpty()) {
            view.showMessage("No students available.");
            return;
        }
        view.showStudentList(students);
    }
}
