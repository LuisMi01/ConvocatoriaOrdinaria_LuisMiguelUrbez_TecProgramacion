package org.example.Ejercicio3.observer;

public class GestorProveedores implements Observador{
    public void actualizar(String mensaje) {
        System.out.println("Gestor Proveedores: " + mensaje);
    }
}
