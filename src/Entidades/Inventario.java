
package Entidades;

import Excepciones.CodeAlreadyExistsException;
import Excepciones.EmptyFieldException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    // Atributos
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<Producto>();
    }

    // Getters
    public int getNumeroProductos(){
        return productos.size();
    }
   
    public Producto getProducto(int i){
        return productos.get(i);
    }

    // Métodos
    public void agregarProducto(Producto articulo) throws CodeAlreadyExistsException, EmptyFieldException{
        
        if (articulo.getCodigo().isBlank() || articulo.getMarca().isBlank() || articulo.getModelo().isBlank() || articulo.getCosto() == 0){
            throw new EmptyFieldException("Existen espacios en blanco que deben ser llenados.");
        }
       
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(articulo.getCodigo()))
                throw new CodeAlreadyExistsException("El codigo ingresado ya existe.");
        }
        
        productos.add(articulo);
    }
     
    public Producto buscarProducto(String codigo){
        ordenarPorCodigo();
        
        int izq = 0;
        int der = this.productos.size() - 1;
        
        while (izq <= der){
            int centro = (izq + der) / 2;
            Producto central = productos.get(centro);
            
            if (central.getCodigo().equals(codigo)){
                return central;
                
            } else if (central.getCodigo().compareTo(codigo) > 0){
                der = centro - 1;
                
            } else {
                izq = centro + 1;
            }
        }
        
        return null;
    }
    
    public void ordenarPorPrecio() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return (int)(p1.getPrecio_venta() - p2.getPrecio_venta());
            }
        });
    }
    
    
    public void ordenarPorStock() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return (int)(p1.getCantidad()- p2.getCantidad());
            }
        });
    }
    
    private void ordenarPorCodigo() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getCodigo().compareTo(p2.getCodigo());
            }
        });
    }
}