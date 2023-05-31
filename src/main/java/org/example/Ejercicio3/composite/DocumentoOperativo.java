package org.example.Ejercicio3.composite;

public class DocumentoOperativo extends Documento{
        public DocumentoOperativo() {
            super("Documento Operativo");
        }

        public void agregarDocumento(Documento documento) {
            throw new UnsupportedOperationException("No se puede agregar un documento a un documento operativo.");
        }

        public void removerDocumento(Documento documento) {
            throw new UnsupportedOperationException("No se puede remover un documento de un documento operativo.");
        }

        public void mostrarDocumentos() {
            System.out.println("Documento: " + nombre);
        }
}
