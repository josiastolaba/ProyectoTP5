package jueves0404.vistas;

import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jueves0404.entidades.Producto;


public class ConsultaProducto extends javax.swing.JInternalFrame {
    
    private TreeSet<Producto> productos;
    /**
     * Creates new form ConsultaProducto
     * @param productos
     */
    public ConsultaProducto(TreeSet<Producto> productos) {
        this.productos = productos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlCategorias = new javax.swing.JLabel();
        jbBuscar2 = new javax.swing.JButton();
        jcCategorias2 = new javax.swing.JComboBox<>();
        jbLimpiarTabla = new javax.swing.JButton();

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel2.setText("Código");

        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtTabla1.setBackground(new java.awt.Color(204, 255, 204));
        jtTabla1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jtTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Precio", "Stock", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jtTabla1);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jlCategorias.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jlCategorias.setText("Categorias");

        jbBuscar2.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jbBuscar2.setText("Buscar");
        jbBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar2ActionPerformed(evt);
            }
        });

        jcCategorias2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        jcCategorias2.setSelectedItem(null);

        jbLimpiarTabla.setText("Limpiar");
        jbLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscar)
                            .addComponent(jlCategorias)
                            .addComponent(jcCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar2))
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
             
         Pattern p=Pattern.compile("\\d{1,4}");
        Matcher m=p.matcher(jtCodigo.getText());
        if(!m.matches()){
            JOptionPane.showMessageDialog(this, "Ustede debe ing. un nro");
            jtCodigo.requestFocus();
            return;
        }
        int codigo=Integer.parseInt(jtCodigo.getText());
        boolean bandera=false;
        for(Producto prod:productos){
        
            if(prod.getCodigo()==codigo){
                bandera=true;
                
                DefaultTableModel model = (DefaultTableModel) jtTabla1.getModel();
                Vector<String> row1 = new Vector<>();
                
                row1.add(String.valueOf(prod.getCodigo()));
                row1.add(prod.getDescripcion());
                row1.add(String.valueOf(prod.getPrecio()));
                row1.add(String.valueOf(prod.getStock()));
                row1.add(prod.getCategoria());
                model.addRow(row1);   
            }
        }
        
        if(!bandera){
        
            JOptionPane.showMessageDialog(this,"Producto no encontrado");
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }           
    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jbBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jtTabla1.getModel();
        
        String categoria2 = jcCategorias2.getSelectedItem()+"";
        System.out.println("la categoria seleccionada es: "+categoria2);
        for(Producto prod:productos){
            if(prod.getCategoria().equals(categoria2)){
                //bandera=true;
                System.out.println("entro aca");
                Vector<String> row1 = new Vector<>();
                
                row1.add(String.valueOf(prod.getCodigo()));
                row1.add(prod.getDescripcion());
                row1.add(prod.getPrecio()+""); // se convierte en String onc las comillas
                row1.add(String.valueOf(prod.getStock()));
                row1.add(prod.getCategoria());
                model.addRow(row1);   
                
            }
        }
    }//GEN-LAST:event_jbBuscar2ActionPerformed

    private void jbLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarTablaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtTabla1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscar2;
    private javax.swing.JButton jbLimpiarTabla;
    private javax.swing.JComboBox<String> jcCategorias2;
    private javax.swing.JLabel jlCategorias;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTable jtTabla1;
    // End of variables declaration//GEN-END:variables
}
