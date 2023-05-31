package org.example.Ejercicio1;

public class Demo {
    public static void ejecutar(){

        GlamourFinancial glamourFinancial = GlamourFinancialImplementation.getInstance();

        // Obtener cotización y actualizar cotización
        double cotizacionActual = glamourFinancial.obtenerCotizacion("Mercado A");
        System.out.println("Cotización actual: " + cotizacionActual);

        glamourFinancial.actualizarCotizacion("Mercado A", 10.5);

        double nuevaCotizacion = glamourFinancial.obtenerCotizacion("Mercado A");
        System.out.println("Nueva cotización: " + nuevaCotizacion);

        // Calcular indicadores financieros
        double valorMercado = glamourFinancial.calcularValorMercado();
        System.out.println("Valor de mercado: " + valorMercado);

        double precioValorEnLibros = glamourFinancial.calcularPrecioValorEnLibros();
        System.out.println("Precio-valor en libros: " + precioValorEnLibros);
    }

}
