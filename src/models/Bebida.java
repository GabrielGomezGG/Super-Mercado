package models;

import utils.UnidadDeVenta;

public class Bebida extends Producto {

    public Bebida(String nombre, Integer precio, Double peso, UnidadDeVenta unidad) {
        super(nombre, precio, peso, unidad);
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+ " /// "+ this.unidad +": "+ this.peso+ " /// Precio: $"+ this.precio;
    }
}
