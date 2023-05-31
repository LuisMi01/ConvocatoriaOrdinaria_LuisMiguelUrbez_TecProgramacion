package org.example.Ejercicio3.composite;

public class DocumentoFinanciero extends Documento{
    public DocumentoFinanciero() {
        super("Documento Financiero");
    }

    public void agregarDocumento(Documento documento) {
        throw new UnsupportedOperationException("No se puede agregar un documento a un documento financiero.");
    }

    public void removerDocumento(Documento documento) {
        throw new UnsupportedOperationException("No se puede remover un documento de un documento financiero.");
    }

    public void mostrarDocumentos() {
        System.out.println("Documento: " + nombre);
    }
}
