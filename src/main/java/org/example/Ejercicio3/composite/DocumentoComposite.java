package org.example.Ejercicio3.composite;

import java.util.ArrayList;
import java.util.List;

public class DocumentoComposite extends Documento{
    private List<Documento> documentos;

    public DocumentoComposite(String nombre) {
        super(nombre);
        this.documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void removerDocumento(Documento documento) {
        documentos.remove(documento);
    }

    public void mostrarDocumentos() {
        System.out.println("Documento: " + nombre);
        for (Documento documento : documentos) {
            documento.mostrarDocumentos();
        }
    }
}
