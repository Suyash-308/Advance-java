package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Course course = new Course();
        course.setName("Web-Development");
        course.setDuration("6 month");
        course.setPrice(50000);


        CourseController courseController = new CourseController();
        courseController.addCourse(course);
    }
}
