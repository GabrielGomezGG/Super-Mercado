import models.Producto;

import java.util.ArrayList;
import java.util.List;

public class SuperMercado {

    private List<Producto> productos;

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

}
