package org.example.Ejercicio2.cliente;

import org.example.Ejercicio2.certificates.BasicCertificate;
import org.example.Ejercicio2.certificates.Certificate;
import org.example.Ejercicio2.certificates.GPAEnhancer;
import org.example.Ejercicio2.cursos.Course;
import org.example.Ejercicio2.employees.Employee;
import org.example.Ejercicio2.employees.EmployeeObserver;
import org.example.Ejercicio2.fabrica.BeautyCourseFactory;
import org.example.Ejercicio2.fabrica.BusinessCourseFactory;
import org.example.Ejercicio2.fabrica.CourseFactory;

public class demo {
    public static void demo(){

            // Crear fábricas de cursos
            CourseFactory beautyCourseFactory = new BeautyCourseFactory();
            CourseFactory businessCourseFactory = new BusinessCourseFactory();

            // Crear cursos
            Course beautyCourse = beautyCourseFactory.createCourse();
            Course businessCourse = businessCourseFactory.createCourse();

            // Crear empleados
            Employee employee1 = new Employee("John Doe");
            Employee employee2 = new Employee("Jane Smith");

            // Observadores
            EmployeeObserver observer1 = new EmployeeObserver() {
                public void update(Employee employee) {
                    System.out.println("se ha inscrito en un nuevo curso!");
                }
            };

            EmployeeObserver observer2 = new EmployeeObserver() {
                public void update(Employee employee) {
                    System.out.println("¡ha registrado una nueva nota!");
                }
            };

            // Adjuntar observadores a los empleados
            employee1.attach(observer1);
            employee1.attach(observer2);
            employee2.attach(observer1);

            // Inscribir empleados en cursos
            employee1.enroll(beautyCourse);
            employee2.enroll(businessCourse);

            // Registrar notas de los empleados
            employee1.recordGrade(beautyCourse, 8.5);
            employee2.recordGrade(businessCourse, 9.2);

            // Calcular promedio académico de los empleados
            double gpaEmployee1 = employee1.calculateGPA();
            double gpaEmployee2 = employee2.calculateGPA();

            // Generar certificados de formación
            Certificate basicCertificate = new BasicCertificate();
            basicCertificate.generate(employee1);

            Certificate gpaEnhancerCertificate = new GPAEnhancer(new BasicCertificate());
            gpaEnhancerCertificate.generate(employee2);
        }

}
