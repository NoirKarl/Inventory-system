
package Principal;

import Entidades.Inventario;
import InterfazGrafica.MenuPrincipal;

public class Main {
    
    public static void main(String[] args) {
        Inventario miInventario = new Inventario();
        
        MenuPrincipal ventana = new MenuPrincipal(miInventario);
        ventana.setVisible(true);
    }
    
}
