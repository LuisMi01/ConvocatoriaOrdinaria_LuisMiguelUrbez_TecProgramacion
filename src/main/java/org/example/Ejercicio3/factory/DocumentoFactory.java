package org.example.Ejercicio3.factory;

import org.example.Ejercicio3.composite.Documento;

public interface DocumentoFactory implements DocumentoFactory{
    Documento crearDocumento();
}
