package org.example.Ejercicio3.cliente;

import org.example.Ejercicio3.composite.Documento;
import org.example.Ejercicio3.composite.DocumentoComposite;
import org.example.Ejercicio3.factory.DocumentoFactory;
import org.example.Ejercicio3.factory.DocumentoFinancieroFactory;
import org.example.Ejercicio3.factory.DocumentoLegalFactory;
import org.example.Ejercicio3.factory.DocumentoOperativoFactory;
import org.example.Ejercicio3.observer.GestorIPO;
import org.example.Ejercicio3.observer.GestorInversionistas;
import org.example.Ejercicio3.observer.GestorProveedores;
import org.example.Ejercicio3.observer.Observador;
import org.example.Ejercicio3.proxy.GestionIPO;
import org.example.Ejercicio3.proxy.GestionIPOProxy;

public class Demo {
    public static void demo(){
        // Crear documentos utilizando el patrón Factory
        DocumentoFactory documentoLegalFactory = new DocumentoLegalFactory();
        DocumentoFactory documentoFinancieroFactory = new DocumentoFinancieroFactory();
        DocumentoFactory documentoOperativoFactory = new DocumentoOperativoFactory();

        Documento documentoComposite = new DocumentoComposite("Documentos IPO");
        documentoComposite.agregarDocumento(documentoLegalFactory.crearDocumento());
        documentoComposite.agregarDocumento(documentoFinancieroFactory.crearDocumento());

        Documento documentoOperativo = documentoOperativoFactory.crearDocumento();
        documentoComposite.agregarDocumento(documentoOperativo);

        // Mostrar los documentos utilizando el patrón Composite
        documentoComposite.mostrarDocumentos();

        // Crear observadores
        Observador gestorIPO = new GestorIPO();
        Observador gestorProveedores = new GestorProveedores();
        Observador gestorInversionistas = new GestorInversionistas();

        // Crear el proxy de la gestión de IPO
        GestionIPO gestionIPOProxy = new GestionIPOProxy();

        // Utilizar el proxy para gestionar proveedores e inversionistas
        gestionIPOProxy.gestionarProveedores();
        gestionIPOProxy.gestionarInversionistas();
    }
}
