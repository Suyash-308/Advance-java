package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;

public class CourseService {
    CourseDao coursedao=new CourseDao();

    public void addCourse(Course course){
     coursedao.addCourse(course);
    }

    public void updateCourse(Course course){
        coursedao.updateCourse(course);
    }

    public void deleteCourse(int id){
     coursedao.deleteCourse(id);
    }

    public Course getCourse(int id){
        return coursedao.getCourse(id);

    }
}
