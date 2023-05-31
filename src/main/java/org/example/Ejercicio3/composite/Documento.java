package org.example.Ejercicio3.composite;

public abstract class Documento {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public abstract void agregarDocumento(Documento documento);
    public abstract void removerDocumento(Documento documento);
    public abstract void mostrarDocumentos();
}
