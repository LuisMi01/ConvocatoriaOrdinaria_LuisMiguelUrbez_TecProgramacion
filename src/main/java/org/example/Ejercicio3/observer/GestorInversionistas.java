package org.example.Ejercicio3.observer;

public class GestorInversionistas implements Observador{
    public void actualizar(String mensaje) {
        System.out.println("Gestor Inversionistas: " + mensaje);
    }
}
