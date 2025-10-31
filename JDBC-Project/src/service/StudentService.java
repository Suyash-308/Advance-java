
package service;

import dao.StudentDao;
import model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private final StudentDao studentDao = new StudentDao();

    public void createStudent(Student student) throws SQLException {
        studentDao.createStudent(student);
    }

    public void updateStudent(Student student) throws SQLException {
        studentDao.updateStudent(student);
    }

    public void deleteStudentById(int id) throws SQLException {
        studentDao.deleteStudentById(id);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudents() throws SQLException {
        return studentDao.getAllStudents();
    }
}
