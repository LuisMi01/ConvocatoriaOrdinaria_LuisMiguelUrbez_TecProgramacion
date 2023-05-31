package org.example.Ejercicio3.observer;

public class GestorIPO implements Observador{
    public void actualizar(String mensaje) {
        System.out.println("Gestor IPO: " + mensaje);
    }
}
