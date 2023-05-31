package org.example.Ejercicio3.factory;

public class DocumentoLegalFactory implements DocumentoFactory{
    public Documento crearDocumento() {
        return new DocumentoLegal();
    }
}
