package clase6;

/**
 *
 * @author German
 */
public class Producto {

    private int codigo;
    protected String nombre;
    private String marca;
    private String tipo;
    private double precioDeCosto;
    private double precioDeVenta;
    private int cantidadEnStock;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, String tipo, double precioDeCosto, double precioDeVenta, int cantidadEnStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioDeCosto = precioDeCosto;
        this.precioDeVenta = precioDeVenta;
        this.cantidadEnStock = cantidadEnStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioDeCosto() {
        return precioDeCosto;
    }

    public void setPrecioDeCosto(double precioDeCosto) {
        this.precioDeCosto = precioDeCosto;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", precioDeCosto=" + precioDeCosto + ", precioDeVenta=" + precioDeVenta + ", cantidadEnStock=" + cantidadEnStock + '}';
    }

}
