public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student object (model)
        Student student = new Student("John Doe", "12345", "A");

        // Create a view object
        StudentView view = new StudentView();

        // Create a controller object
        StudentController controller = new StudentController(student, view);

        // Update view with initial student details
        controller.updateView();

        // Update student details via controller
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Update view with new student details
        controller.updateView();
    }
}
