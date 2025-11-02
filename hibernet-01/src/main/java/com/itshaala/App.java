package com.itshaala;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Student student = new Student();
        student.setName("ram");
        student.setEmail("ravan@gmail.com");
        student.setPhone("984785823");

        StudentController studentController = new StudentController();
        studentController.createStudent(student);
    }
}
