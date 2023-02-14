
package InterfazGrafica;

import Entidades.Inventario;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private Inventario miInventario;
    
    public MenuPrincipal(Inventario inventario) {
        miInventario = inventario;
        initComponents();
        colocarIcono();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 51, 51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productosRegistrados = new javax.swing.JLabel();
        panelIngresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelFijar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelConsultar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelConsultar2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelReporte = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Inventario");
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                contadorProductos(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos registrados:");

        productosRegistrados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        productosRegistrados.setText("0");

        panelIngresar.setBackground(new java.awt.Color(0, 102, 102));
        panelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIngresarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Producto");

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelFijar.setBackground(new java.awt.Color(0, 102, 102));
        panelFijar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFijarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fijar Precio de Venta");

        javax.swing.GroupLayout panelFijarLayout = new javax.swing.GroupLayout(panelFijar);
        panelFijar.setLayout(panelFijarLayout);
        panelFijarLayout.setHorizontalGroup(
            panelFijarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFijarLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(31, 31, 31))
        );
        panelFijarLayout.setVerticalGroup(
            panelFijarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFijarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelConsultar.setBackground(new java.awt.Color(0, 102, 102));
        panelConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelConsultarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultar Artículo");

        javax.swing.GroupLayout panelConsultarLayout = new javax.swing.GroupLayout(panelConsultar);
        panelConsultar.setLayout(panelConsultarLayout);
        panelConsultarLayout.setHorizontalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(41, 41, 41))
        );
        panelConsultarLayout.setVerticalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelConsultar2.setBackground(new java.awt.Color(0, 102, 102));
        panelConsultar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelConsultar2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consultar ");

        javax.swing.GroupLayout panelConsultar2Layout = new javax.swing.GroupLayout(panelConsultar2);
        panelConsultar2.setLayout(panelConsultar2Layout);
        panelConsultar2Layout.setHorizontalGroup(
            panelConsultar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultar2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(77, 77, 77))
        );
        panelConsultar2Layout.setVerticalGroup(
            panelConsultar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultar2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelSalir.setBackground(new java.awt.Color(0, 102, 102));
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSalirMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salir");

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(97, 97, 97))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelReporte.setBackground(new java.awt.Color(0, 102, 102));
        panelReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelReporteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mostrar Reporte");

        javax.swing.GroupLayout panelReporteLayout = new javax.swing.GroupLayout(panelReporte);
        panelReporte.setLayout(panelReporteLayout);
        panelReporteLayout.setHorizontalGroup(
            panelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReporteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
        );
        panelReporteLayout.setVerticalGroup(
            panelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReporteLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFijar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConsultar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productosRegistrados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFijar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productosRegistrados))
                .addGap(16, 16, 16))
        );

        panel.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Acceso a los paneles  
    
    private void panelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIngresarMouseClicked
        JFrame ventana = new IngresarProducto(miInventario);
        cambiarMenu(ventana);
        panelIngresar.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_panelIngresarMouseClicked

    private void panelFijarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFijarMouseClicked
        JFrame ventana = new FijarPrecioVenta(miInventario);
        cambiarMenu(ventana);
        panelFijar.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_panelFijarMouseClicked

    private void panelConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConsultarMouseClicked
        JFrame ventana = new ConsultarArticulo(miInventario);
        cambiarMenu(ventana);
        panelConsultar.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_panelConsultarMouseClicked

    private void panelConsultar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConsultar2MouseClicked
        JFrame ventana = new ConsultarPrecioStock(miInventario);
        if (miInventario.getNumeroProductos() > 1){
            cambiarMenu(ventana);
            panelConsultar2.setBackground(new Color(0, 51, 51));
        } else {
            JOptionPane.showMessageDialog(null, "Debes tener al menos dos artículos registrados.", "Error", 0);
        }
    }//GEN-LAST:event_panelConsultar2MouseClicked

    private void contadorProductos(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_contadorProductos
        productosRegistrados.setText(String.valueOf(miInventario.getNumeroProductos()));
    }//GEN-LAST:event_contadorProductos

    private void panelReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReporteMouseClicked
        JFrame ventana = new ReporteArticulos(miInventario);
        cambiarMenu(ventana);
        panelReporte.setBackground(new Color(0, 51, 51));
    }//GEN-LAST:event_panelReporteMouseClicked

    private void panelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseClicked
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            System.exit(0);
}
    }//GEN-LAST:event_panelSalirMouseClicked

    private void cambiarMenu(JFrame ventana){
        ventana.getContentPane().setBackground(new Color(0, 153, 153));
        colorPanel();
        
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        
        panel.removeAll();
        panel.add(ventana.getRootPane(), c);
        panel.revalidate();
        panel.repaint();
    }
    
    private void colorPanel(){
        panelIngresar.setBackground(new Color(0, 102, 102));
        panelFijar.setBackground(new Color(0, 102, 102));
        panelConsultar.setBackground(new Color(0, 102, 102));
        panelConsultar2.setBackground(new Color(0, 102, 102));
        panelReporte.setBackground(new Color(0, 102, 102));
    }
    
    private void colocarIcono(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/icon.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelConsultar;
    private javax.swing.JPanel panelConsultar2;
    private javax.swing.JPanel panelFijar;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelReporte;
    private javax.swing.JPanel panelReporte1;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JLabel productosRegistrados;
    // End of variables declaration//GEN-END:variables
}
