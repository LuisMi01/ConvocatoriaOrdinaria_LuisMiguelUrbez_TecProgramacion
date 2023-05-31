package org.example.Ejercicio3.composite;

public class DocumentoLegal extends Documento{
    public DocumentoLegal() {
        super("Documento Legal");
    }

    public void agregarDocumento(Documento documento) {
        throw new UnsupportedOperationException("No se puede agregar un documento a un documento legal.");
    }

    public void removerDocumento(Documento documento) {
        throw new UnsupportedOperationException("No se puede remover un documento de un documento legal.");
    }

    public void mostrarDocumentos() {
        System.out.println("Documento: " + nombre);
    }
}
