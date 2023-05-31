package org.example.Ejercicio2.certificates;

import org.example.Ejercicio2.employees.Employee;

public class BasicCertificate implements Certificate{
    public void generate(Employee employee) {
        System.out.println("Generado certificado para el empleado");
    }
}
