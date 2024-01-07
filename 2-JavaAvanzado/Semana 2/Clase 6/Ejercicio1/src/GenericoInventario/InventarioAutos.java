package GenericoInventario;

import Modelos.Auto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventarioAutos {

    private List<Auto> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();

    }

    public List<Auto> getInventario() {
        return this.inventario;
    }

    public <T extends Auto> void añadirAuto(T auto) {
        inventario.add(auto);
    }

    public <T> List<Auto> filtrarFechaModelo(List<Auto> autos, T criterio) {
        List<Auto> resultado = new ArrayList<>();

        if (criterio instanceof String) {
            String criterioString = criterio.toString();
            try {
                int fecha = Integer.parseInt(criterioString);
                for (Auto auto : autos) {
                    if (auto.getAño() == fecha) {
                        resultado.add(auto);
                    }
                }
            } catch (NumberFormatException e) {
                for (Auto auto : autos) {
                    if (auto.getMarca().equalsIgnoreCase(criterioString)) {
                        resultado.add(auto);
                    }
                }
            }
        }
        if (resultado.isEmpty()) {
            System.out.println("No existe ningún coche con la marca o año especificado.");
        }
        return resultado;
    }

    public double valorTotalPrecios(List<Auto> autos) {
        double valorTotal = 0.0;
        for (Auto auto : autos) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }

    public void mostrarInventario() {
        for (Auto auto : inventario) {
            System.out.println(auto);
        }

    }

    public static String obtenerEntrada(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
