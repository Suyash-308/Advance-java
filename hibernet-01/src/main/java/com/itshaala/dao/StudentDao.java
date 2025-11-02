package com.itshaala.dao;

import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
    public void createStudent(Student student){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(student);
        transaction.commit();
        System.out.println("Student record save successfully");
    }

    public void updateStudent(Student student){

    }

    public void deleteStudent(Student student){

    }

    public Student getStudentById(int id){
        return null;
    }

}
