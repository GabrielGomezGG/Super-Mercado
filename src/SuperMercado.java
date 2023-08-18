import models.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SuperMercado {

    private ArrayList<Producto> productos;

    public SuperMercado(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void mostrarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=============================");
    }

    public Producto productoMasCaro(){

        var productosClon = (ArrayList<Producto>) productos.clone();

        Collections.sort(productosClon, Comparator.reverseOrder());

        return productosClon.get(0);
    }

    public Producto productoMasBarato(){

        var productosClon = (ArrayList<Producto>) productos.clone();

        Collections.sort(productosClon);

        return productosClon.get(0);
    }

    public void mostrarProductoMasCaro(){
        System.out.println("Producto más caro: "+ productoMasCaro().getNombre());
    }

    public void mostrarProductoMasBarato(){
        System.out.println("Producto más barato: "+ productoMasBarato().getNombre());
    }

}
