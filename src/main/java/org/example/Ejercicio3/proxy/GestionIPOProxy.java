package org.example.Ejercicio3.proxy;

public class GestionIPOProxy implements GestionIPO{
    private GestionIPOReal gestionReal;

    public GestionIPOProxy() {
        this.gestionReal = new GestionIPOReal();
    }

    public void gestionarProveedores() {
        // Realizar tareas adicionales antes de delegar la llamada al objeto real
        // ...
        gestionReal.gestionarProveedores();
    }

    public void gestionarInversionistas() {
        // Realizar tareas adicionales antes de delegar la llamada al objeto real
        // ...
        gestionReal.gestionarInversionistas();
    }
}
