
package Entidades;

public class Producto {
    
    // Atributos
    private String codigo;
    private String descripcion;
    private String marca;
    private String modelo;
    private int cantidad;
    private double costo;
    private double precio_venta;
    private String estado;

    // Constructor
    public Producto(String codigo, String descripcion, String marca, String modelo, int cantidad, double costo, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.costo = costo;
        this.estado = estado;
        this.precio_venta = 0;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

}
