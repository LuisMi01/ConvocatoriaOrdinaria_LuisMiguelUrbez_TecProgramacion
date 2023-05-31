package org.example.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class GlamourFinancialImplementation implements GlamourFinancial{
    private Map<String, Double> cotizaciones;

    private static GlamourFinancialImplementation instance;

    private GlamourFinancialImplementation() {
        cotizaciones = new HashMap<>();
    }

    public static synchronized GlamourFinancialImplementation getInstance() {
        if (instance == null) {
            instance = new GlamourFinancialImplementation();
        }
        return instance;
    }

    @Override
    public double obtenerCotizacion(String mercado) {
        return cotizaciones.getOrDefault(mercado, 0.0);
    }

    @Override
    public void actualizarCotizacion(String mercado, double nuevaCotizacion) {
        cotizaciones.put(mercado, nuevaCotizacion);
    }

    @Override
    public double calcularValorMercado(){
        double valorMercado = 0.0;

        for (double cotizacion : cotizaciones.values()) {
            valorMercado += cotizacion;
        }

        return valorMercado;
    }

    @Override
    public double calcularPrecioValorEnLibros() {
        double precioValorEnLibros = 0.0;
        double factorPrecioValor = 1.5;
        double valorMercado = calcularValorMercado();

        precioValorEnLibros = valorMercado * factorPrecioValor;

        return precioValorEnLibros;
    }
}
