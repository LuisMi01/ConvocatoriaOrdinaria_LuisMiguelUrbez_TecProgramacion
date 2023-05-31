package org.example.Ejercicio3.factory;

import org.example.Ejercicio3.composite.Documento;
import org.example.Ejercicio3.composite.DocumentoOperativo;

public class DocumentoOperativoFactory implements DocumentoFactory{
    public Documento crearDocumento() {
        return new DocumentoOperativo();
    }
}
