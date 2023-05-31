package org.example.Ejercicio2.cursos;

import org.example.Ejercicio2.employees.Employee;

public class BeautyCourse implements Course{

    @Override
    public void enroll(Employee employee) {
        System.out.println("Enrolling employee in Beauty Course");
    }

    @Override
    public void recordGrade(Employee employee, double grade) {
        System.out.println("Recording grade for employee in Beauty Course");
    }
}
