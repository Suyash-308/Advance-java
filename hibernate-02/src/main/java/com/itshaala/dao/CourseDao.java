package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CourseDao {
    public void addCourse(Course course){
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(course);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("added successfully");

    }

    public void updateCourse(Course course){
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.merge(course);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("update successfully");
    }

    public void deleteCourse(int id){
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.remove(id);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("deleted successfully");
    }

    public Course getCourse(int id){
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Course course=session.find(Course.class,id);
        session.merge(course);
        session.close();
        sessionFactory.close();
        return course;

    }
}
