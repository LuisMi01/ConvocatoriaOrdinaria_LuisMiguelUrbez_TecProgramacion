package org.example.Ejercicio2.fabrica;

import org.example.Ejercicio2.cursos.BeautyCourse;
import org.example.Ejercicio2.cursos.Course;

public class BeautyCourseFactory implements CourseFactory {
    public Course createCourse() {
        return (Course) new BeautyCourse();
    }
}
