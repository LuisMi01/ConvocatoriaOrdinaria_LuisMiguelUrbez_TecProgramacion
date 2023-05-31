package org.example.Ejercicio2.certificates;

import org.example.Ejercicio2.employees.Employee;

public abstract class CertificateDecorator implements Certificate {
    private Certificate decoratedCertificate;

    public CertificateDecorator(Certificate decoratedCertificate) {
        this.decoratedCertificate = decoratedCertificate;
    }

    public void generate(Employee employee) {
        decoratedCertificate.generate(employee);
    }
}
