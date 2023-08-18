package models;

import utils.UnidadDeVenta;

public class Producto implements Comparable<Producto> {

    protected String nombre;
    protected Double peso;
    protected Integer precio;
    protected UnidadDeVenta unidad;

    public Producto(String nombre, Integer precio, Double peso, UnidadDeVenta unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.precio - producto.precio ;
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+ " /// "+ this.unidad +": "+ this.peso+ " /// Precio: $"+ this.precio;
    }
}
