package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDao {
    @SneakyThrows
    public void createStudent(Student student) throws SQLException {
        String query="insert into student (name,email,phone) values(?,?,?)";
        Connection connection= ConnectionUtil.getConnection();
        PreparedStatement ps =connection.prepareStatement(query);
        ps.setString(1,student.getName());
        ps.setString(2,student.getEmail());
        ps.setString(3,student.getPhone());
        ps.executeUpdate();
        connection.close();
    }

    @SneakyThrows
    public void updateStudent(Student student) throws SQLException {
        String query="update student set name=?,email=?,phone=? where id=?" ;
        Connection connection= ConnectionUtil.getConnection();
        PreparedStatement ps =connection.prepareStatement(query);
        ps.setString(1,student.getName());
        ps.setString(2,student.getEmail());
        ps.setString(3,student.getPhone());
        ps.setInt(4,student.getId());
        ps.executeUpdate();
        connection.close();
    }

    @SneakyThrows
    public void deleteStudent(Student student) throws SQLException {
        String query="delete from student where id=?";
        Connection connection= ConnectionUtil.getConnection();
        PreparedStatement ps =connection.prepareStatement(query);
        ps.setInt(4,student.getId());
        ps.executeUpdate();
        connection.close();
    }

    @SneakyThrows
    public Student getStudentById(int id) throws SQLException {
        String query= "select * from student where id=? ";
        Connection connection= ConnectionUtil.getConnection();
        PreparedStatement ps =connection.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet resultSet= ps.executeQuery();
        Student student=new Student();
        while (resultSet.next()){
           student.setId(resultSet.getInt("id"));
           student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
        }
        connection.close();
        return student;
    };
    @SneakyThrows
    public List<Student> getAllStudent() throws SQLException {
        List <Student> studentList=new ArrayList<>();
        String query= "select * from student where id=? ";
        Connection connection= ConnectionUtil.getConnection();
        Statement ps =connection.createStatement();
        ResultSet resultSet= ps.executeQuery(query);

        while (resultSet.next()){
            Student student= new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
            studentList.add(student);
        }
        connection.close();
        return studentList;
    };
}
