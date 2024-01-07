package Modelos;


public class Auto {

    private String marca;
    private String modelo;
    private int año;
    private Double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int año, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "La marca del coche es: " + marca + ". Su modelo es: " + modelo + ". El a\u00f1o es: " + año + " y el precio es de: " + precio + "€";
    }

}
