package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    StudentDao studentDao=new StudentDao();
    public void createStudent(Student student) throws SQLException {
      studentDao.createStudent(student);
    }

    public void updateStudent(Student student) throws SQLException {
       studentDao.updateStudent(student);
    }

    public void deleteStudent(Student student) throws SQLException {
       studentDao.deleteStudent(student);
    }


    public Student getStudentById(int id) throws SQLException {
        return  studentDao.getStudentById(id);
    };

    public List<Student> getAllStudent() throws SQLException {
       return  studentDao.getAllStudent();
    };
}
