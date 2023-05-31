package org.example.Ejercicio2.cursos;

import org.example.Ejercicio2.employees.Employee;

public interface Course {
    void enroll(Employee employee);
    void recordGrade(Employee employee, double grade);
}
