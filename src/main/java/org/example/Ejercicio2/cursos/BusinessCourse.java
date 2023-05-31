package org.example.Ejercicio2.cursos;

import org.example.Ejercicio2.employees.Employee;

public class BusinessCourse implements Course{
    @Override
    public void enroll(Employee employee) {
        System.out.println("Enrolling employee in Business Course");
    }

    @Override
    public void recordGrade(Employee employee, double grade) {
        System.out.println("Recording grade for employee in Business Course");
    }
}
