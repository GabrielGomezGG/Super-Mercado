package models;

import utils.UnidadDeVenta;

public class Producto {

    protected String nombre;
    protected Double peso;
    protected Integer precio;
    protected UnidadDeVenta unidad;

    Producto(String nombre, Integer precio, Double peso, UnidadDeVenta unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.unidad = unidad;
    }

}
