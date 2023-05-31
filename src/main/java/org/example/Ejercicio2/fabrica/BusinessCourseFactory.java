package org.example.Ejercicio2.fabrica;

import org.example.Ejercicio2.cursos.BusinessCourse;
import org.example.Ejercicio2.cursos.Course;

public class BusinessCourseFactory implements CourseFactory {
    public Course createCourse() {
        return (Course) new BusinessCourse();

    }
}
