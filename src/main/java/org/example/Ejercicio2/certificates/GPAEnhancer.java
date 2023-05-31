package org.example.Ejercicio2.certificates;

import org.example.Ejercicio2.employees.Employee;

public class GPAEnhancer  extends CertificateDecorator{
    public GPAEnhancer(Certificate decoratedCertificate) {
        super(decoratedCertificate);
    }

    public void generate(Employee employee) {
        super.generate(employee);
        System.out.println("El promedio del empleado es de " + employee.calculateGPA());
    }
}
