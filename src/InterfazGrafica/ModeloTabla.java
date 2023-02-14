
package InterfazGrafica;

import Entidades.Inventario;
import Entidades.Producto;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel{

    private Inventario miInventario;
    private String[] nombre_columnas = {"Codigo", "Marca", "Modelo", "Descripcion",
                                        "Costo", "Precio de Venta"};
    
    public ModeloTabla(Inventario miInventario) {
        this.miInventario = miInventario;
    }
    
    @Override
    public int getRowCount(){
        return miInventario.getNumeroProductos();
    }
    
    @Override
    public int getColumnCount(){
        return nombre_columnas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return nombre_columnas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = miInventario.getProducto(rowIndex);
        
        switch(columnIndex){
            case 0:
                return producto.getCodigo();
            case 1:
                return producto.getMarca();
            case 2:
                return producto.getModelo();
            case 3:
                return producto.getDescripcion();
            case 4:
                return String.format("$%.2f",producto.getCosto());
            case 5:
                return String.format("$%.2f",producto.getPrecio_venta());
           default:
               return null;
        }
    }
    
    @Override
    public void setValueAt(Object valor, int rowIndex, int columnIndex){
        Producto producto = miInventario.getProducto(rowIndex);
        
        switch(columnIndex){
            case 0 -> producto.setCodigo((String) valor);
                
            case 1 -> producto.setMarca((String) valor);
                
            case 2 -> producto.setModelo((String) valor);
                
            case 3 -> producto.setDescripcion((String) valor);
                
            case 4 -> producto.setCosto((int) valor);
               
            case 5 ->  producto.setPrecio_venta((double) valor);

        }
    }
    
}
