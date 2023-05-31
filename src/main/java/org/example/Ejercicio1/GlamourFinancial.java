package org.example.Ejercicio1;

public interface GlamourFinancial {
    double obtenerCotizacion(String mercado);
    void actualizarCotizacion(String mercado, double nuevaCotizacion);
    double calcularValorMercado();
    double calcularPrecioValorEnLibros();
}
