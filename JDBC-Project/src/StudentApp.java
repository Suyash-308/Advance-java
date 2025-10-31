import controller.StudentController;


import model.Student;

import java.sql.SQLException;


public class StudentApp {
    public static void main(String[] args) throws SQLException {
        StudentController studentController=new StudentController();
        Student student=new Student();
        student.setId(1);
        student.setName("ram");
        student.setEmail("ram@gmail.com");
        student.setPhone("98456678");

//         studentController.createStudent(student);
//         studentController.updateStudent(student);
//         studentController.deleteStudentById(2);
//           System.out.println(studentController.getStudentById(1));
//         studentController.getAllStudents().forEach(System.out::println);

    }
}