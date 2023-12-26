package clase6;

import java.util.ArrayList;

/**
 *
 * @author German
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Producto producto = new Producto(0, "Portatil", "Gigabyte", "GF", 670, 1054, 8);
        Producto producto1 = new Producto(1, "Placa Base", "Asus", "JL526", 200, 458, 14);
        Producto producto2 = new Producto(2, "Tarjeta de video", "Nvidia", "Rtx3060", 300, 647, 8);
        Producto producto3 = new Producto(3, "Telefono", "Xiaomi", "Redmi note", 456, 643, 83);
        Producto producto4 = new Producto(4, "Auriculares", "Samsung", "Dino9", 45, 76, 25);
        Producto producto5 = new Producto(5, "Auriculares Pro", "Samsung", "Dino9 plus", 67, 114, 17);
        Producto producto6 = new Producto(6, "Tablet", "HP", "I6", 78, 145, 24);
        Producto producto7 = new Producto(7, "Cargador", "Xiaomi", "15w", 4, 15, 45);
        Producto producto8 = new Producto(8, "Cargador rapido", "Xiaomi", "110w", 34, 100.40, 8);
        Producto producto9 = new Producto(9, "Placa refrigeradora", "Asus", "Rj34", 67, 125.99, 34);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        listaProductos.add(producto6);
        listaProductos.add(producto7);
        listaProductos.add(producto8);
        listaProductos.add(producto9);

        Producto maxPrecioVenta = maxPrecioVenta(listaProductos);
        Producto minPrecioCosto = minPrecioCosto(listaProductos);
        Producto maxStock = maxStock(listaProductos);
        
        int maxStockMenosTres = (maxStock.getCantidadEnStock()-3);

        System.out.println("Producto con mayor precio de venta es el " + maxPrecioVenta.nombre + ".\n");

        System.out.println("Producto con menor precio de costo es el " + minPrecioCosto.nombre + ".\n");

        System.out.println("El producto que se encuentra en la posisicon 5 del array son: " + producto5.getNombre() + ".");
        System.out.println("Vamos a borrar ese producto del array.");
        listaProductos.remove(5);
        Producto nuevaPosicion5 = listaProductos.get(5); //Realizo esto para poder mostrar el nombre en concreto del prodcuto y no toda la cadena.
        System.out.println("El nuevo producto que se encuentra en la posicion 5 del array es la " + nuevaPosicion5.getNombre() + ".\n"); //Como podemos ver ha cambiado de Auriculares pro a Tablet.

        System.out.println("El producto con mayor cantidad de Stock es: " + maxStock.nombre + " con una cantidad de " + maxStock.getCantidadEnStock() + ".");
        System.out.println("El stock nuevo del producto " + maxStock.nombre + " es de " + maxStockMenosTres + " tras haber comprado 3 unidades.");
    }

    private static Producto maxPrecioVenta(ArrayList<Producto> listaProductos) {
        Producto maxPrecioVenta = listaProductos.get(0);
        for (Producto producto : listaProductos) {
            if (producto.getPrecioDeVenta() > maxPrecioVenta.getPrecioDeVenta()) {
                maxPrecioVenta = producto;
            }
        }
        return maxPrecioVenta;
    }

    private static Producto minPrecioCosto(ArrayList<Producto> listaProductos) {
        Producto minPrecioCosto = listaProductos.get(0);
        for (Producto producto : listaProductos) {
            if (producto.getPrecioDeCosto() < minPrecioCosto.getPrecioDeCosto()) {
                minPrecioCosto = producto;
            }
        }
        return minPrecioCosto;
    }

    private static Producto maxStock(ArrayList<Producto> listaProductos) {
        Producto maxStock = listaProductos.get(0);
        for (Producto producto : listaProductos) {
            if (producto.getCantidadEnStock() > maxStock.getCantidadEnStock()) {
                maxStock = producto;
            }
        }
        return maxStock;
    }

}
