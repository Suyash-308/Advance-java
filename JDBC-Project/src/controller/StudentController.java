
package controller;

import model.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private final StudentService studentService = new StudentService();

    public void createStudent(Student student) throws SQLException {
        studentService.createStudent(student);
    }

    public void updateStudent(Student student) throws SQLException {
        studentService.updateStudent(student);
    }

    public void deleteStudentById(int id) throws SQLException {
        studentService.deleteStudentById(id);
    }

    public Student getStudentById(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudents() throws SQLException {
        return studentService.getAllStudents();
    }
}
