package org.example.Ejercicio2.employees;

public interface EmployeeSubject {
    void attach(EmployeeObserver observer);
    void detach(EmployeeObserver observer);
    void notifyObservers();
}
