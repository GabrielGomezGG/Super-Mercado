import models.Bebida;
import models.Fruta;
import models.Limpieza;
import utils.UnidadDeVenta;

public class Main {
    public static void main(String[] args) {

        SuperMercado superMercado = new SuperMercado();

        superMercado.agregarProducto(new Bebida("Cola-Cola Zero", 20, 1.5, UnidadDeVenta.Litros));
        superMercado.agregarProducto(new Bebida("Cola-Cola", 18, 1.5, UnidadDeVenta.Litros));
        superMercado.agregarProducto(new Limpieza("Shampoo Sedal", 19, 500.0, UnidadDeVenta.ml));
        superMercado.agregarProducto(new Fruta("Frutillas", 64, 5.0, UnidadDeVenta.kilo));

        superMercado.mostrarProductos();
        superMercado.mostrarProductoMasCaro();
        superMercado.mostrarProductoMasBarato();

    }
}
