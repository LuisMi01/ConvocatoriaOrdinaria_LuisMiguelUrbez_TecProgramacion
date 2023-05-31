package org.example.Ejercicio2.employees;

import org.example.Ejercicio2.cursos.Course;

import java.util.ArrayList;
import java.util.List;

public class Employee implements EmployeeSubject {
    private String name;
    private List<Course> enrolledCourses;
    private List<Double> grades;
    private List<EmployeeObserver> observers;

    public Employee(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void attach(EmployeeObserver observer) {
        observers.add(observer);
    }

    public void detach(EmployeeObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (EmployeeObserver observer : observers) {
            observer.update(this);
        }
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
        notifyObservers();
    }

    public void recordGrade(Course course, double grade) {
        int index = enrolledCourses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
            notifyObservers();
        }
    }

    public double calculateGPA() {
        if (grades.size() > 0) {
            double sum = 0.0;
            for (Double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return 0.0;
    }
}
