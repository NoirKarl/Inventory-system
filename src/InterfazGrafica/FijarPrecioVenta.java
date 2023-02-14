
package InterfazGrafica;

import Entidades.Inventario;
import Entidades.Producto;
import javax.swing.JOptionPane;

public class FijarPrecioVenta extends javax.swing.JFrame {

    private ModeloTabla modelo;
    private Inventario inventario;
    
    public FijarPrecioVenta(Inventario miInventario) {
        initComponents();
        this.inventario = miInventario;
        modelo = new ModeloTabla(miInventario);
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        computadora = new javax.swing.JRadioButton();
        portatil = new javax.swing.JRadioButton();
        otros = new javax.swing.JRadioButton();
        impresoraTinta = new javax.swing.JRadioButton();
        impresoraMatricial = new javax.swing.JRadioButton();
        impresoraLaser = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Modelo", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(102, 255, 204));
        jScrollPane1.setViewportView(tabla);

        computadora.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(computadora);
        computadora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        computadora.setForeground(new java.awt.Color(255, 255, 255));
        computadora.setText("Computadora +20%");
        computadora.setActionCommand("Computadora");

        portatil.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(portatil);
        portatil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        portatil.setForeground(new java.awt.Color(255, 255, 255));
        portatil.setText("Portátil +15%");
        portatil.setActionCommand("Portatil");

        otros.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(otros);
        otros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otros.setForeground(new java.awt.Color(255, 255, 255));
        otros.setText("Otros +11%");
        otros.setActionCommand("Otros");

        impresoraTinta.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(impresoraTinta);
        impresoraTinta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        impresoraTinta.setForeground(new java.awt.Color(255, 255, 255));
        impresoraTinta.setText("Impresora Tinta +13%");
        impresoraTinta.setActionCommand("Impresora Tinta");

        impresoraMatricial.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(impresoraMatricial);
        impresoraMatricial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        impresoraMatricial.setForeground(new java.awt.Color(255, 255, 255));
        impresoraMatricial.setText("Impresora Matricial +8%");
        impresoraMatricial.setActionCommand("Impresora Matricial");

        impresoraLaser.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(impresoraLaser);
        impresoraLaser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        impresoraLaser.setForeground(new java.awt.Color(255, 255, 255));
        impresoraLaser.setText("Impresora Láser +17%");
        impresoraLaser.setActionCommand("Impresora Laser");

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Asignar Precio de Venta");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijarPrecio(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fijar Precio de Venta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otros)
                                    .addComponent(computadora)
                                    .addComponent(portatil))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(impresoraLaser)
                                    .addComponent(impresoraTinta)
                                    .addComponent(impresoraMatricial)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(portatil)
                        .addGap(18, 18, 18)
                        .addComponent(computadora)
                        .addGap(18, 18, 18)
                        .addComponent(otros))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(impresoraMatricial)
                        .addGap(18, 18, 18)
                        .addComponent(impresoraTinta)
                        .addGap(18, 18, 18)
                        .addComponent(impresoraLaser)))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fijarPrecio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fijarPrecio
        try{
            double multiplicador = 0;

            String opcion = buttonGroup1.getSelection().getActionCommand();
        
            switch (opcion) {
                case "Portatil" -> multiplicador = 1.15;

                case "Computadora" -> multiplicador = 1.20;

                case "Otros" -> multiplicador = 1.11;

                case "Impresora Matricial" -> multiplicador = 1.08;

                case "Impresora Tinta" -> multiplicador = 1.13;

                case "Impresora Laser" -> multiplicador = 1.17;
            }
        
            Producto seleccion = inventario.getProducto(tabla.getSelectedRow());
            double valor = seleccion.getCosto() * multiplicador;

            tabla.setValueAt(valor, tabla.getSelectedRow(), 5);
            JOptionPane.showMessageDialog(null, "Artículo actualizado. Nuevo precio de venta: $" + String.format("%.2f", valor), "Aviso", 1);
            buttonGroup1.clearSelection();
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Asegúrese de seleccionar el tipo.", "Error", 0);
        } catch (IndexOutOfBoundsException ex2){
            JOptionPane.showMessageDialog(null, "Asegúrese de seleccionar el artículo.", "Error", 0);
        }
    }//GEN-LAST:event_fijarPrecio

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton computadora;
    private javax.swing.JRadioButton impresoraLaser;
    private javax.swing.JRadioButton impresoraMatricial;
    private javax.swing.JRadioButton impresoraTinta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton otros;
    private javax.swing.JRadioButton portatil;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
