/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vet.Acceso.TratamientoData;
import vet.Entidades.Tratamiento;

/**
 *
 * @author Exon
 */
public class VTratamientos extends javax.swing.JInternalFrame {
         
    FondoPanel fondo = new FondoPanel();
    
    Tratamiento trat;
    TratamientoData tratdat;
    
    ArrayList<Tratamiento> listtrata=new ArrayList<>();
    
    public VTratamientos() {
        
        this.setContentPane(fondo);
        initComponents();
     
        trat=new Tratamiento();
        tratdat=new TratamientoData();
             
        cargarCombo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextImporte = new javax.swing.JTextField();
        jRadio = new javax.swing.JRadioButton();
        jBguardar = new javax.swing.JButton();
        jBmod = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDes = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jLabelID = new java.awt.Label();
        jTextTipo = new java.awt.TextField();
        jCombo = new javax.swing.JComboBox<>();
        jBuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 115, 133));
        setPreferredSize(new java.awt.Dimension(900, 550));

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnSalir.png"))); // NOI18N
        jBsalir.setToolTipText("");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BannerVetTrat.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(216, 227, 240));
        jLabel2.setText("Tipo de tratamiento: ");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(216, 227, 240));
        jLabel3.setText("Descripción de tratamiento: ");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(216, 227, 240));
        jLabel4.setText("Importe:  $");

        jTextImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextImporteKeyTyped(evt);
            }
        });

        jRadio.setBackground(new java.awt.Color(0, 115, 133));
        jRadio.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jRadio.setForeground(new java.awt.Color(216, 227, 240));
        jRadio.setText("  : Activo");
        jRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnGuardar.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnMod.png"))); // NOI18N
        jBmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodActionPerformed(evt);
            }
        });

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnEliminar.png"))); // NOI18N
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jTextDes.setColumns(20);
        jTextDes.setRows(5);
        jScrollPane1.setViewportView(jTextDes);

        label1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("ID Tratamiento:");

        jLabelID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelID.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 0));

        jTextTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTipoActionPerformed(evt);
            }
        });

        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnBuscar.png"))); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnNuevo.png"))); // NOI18N
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(535, 535, 535)
                                .addComponent(jBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBmod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadio)
                            .addComponent(jBsalir))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCombo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBuscar)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadio)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBmod)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBnuevo)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioActionPerformed
       
    }//GEN-LAST:event_jRadioActionPerformed

    private void jBmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodActionPerformed
       
        int id=Integer.parseInt(jLabelID.getText());
        boolean est=jRadio.isSelected();
        double imp=Double.parseDouble(jTextImporte.getText());
        
        String des=jTextDes.getText();
        String tipo=jTextTipo.getText();
        
        
        Tratamiento trat1=new Tratamiento(id,des,tipo,est, imp);
        
        tratdat.modificarTratamiento(trat1);
        
        cargarCombo();
        
    }//GEN-LAST:event_jBmodActionPerformed

    private void jTextTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTipoActionPerformed
      
    }//GEN-LAST:event_jTextTipoActionPerformed

    private void jTextImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextImporteKeyTyped
        
            if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
                                                    }
            if(evt.getKeyChar()==KeyEvent.VK_SPACE){
            evt.consume();
                                                   }
    }//GEN-LAST:event_jTextImporteKeyTyped
       
    
    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
        String tipo=jTextTipo.getText();
        String descripcion=jTextDes.getText();
        
        double importe=Double.parseDouble(jTextImporte.getText());
        
        trat=new Tratamiento(descripcion,tipo, true,importe);
        
        tratdat.guardarTratamiento(trat);
        
        listtrata=(ArrayList) tratdat.obtenerTratamientos();
        
        cargarCombo();  
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
     
        
      
        
        
        
        
        
    }//GEN-LAST:event_jComboActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        
        
            trat=(Tratamiento)jCombo.getSelectedItem();
            
            Tratamiento tra= tratdat.buscarTratamiento(trat.getIdTrat());
        
            jTextTipo.setText(tra.getTipoTrat());
            jTextDes.setText(tra.getDescripcion());
            jTextImporte.setText(String.valueOf(tra.getImporte()));
            jLabelID.setText(String.valueOf(tra.getIdTrat()));
            
            
            
             if(tra.isEstado()==true){
                jRadio.setSelected(true);
        
             }else{jRadio.setSelected(false);
                                              }
        
        
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
       
        jCombo.setSelectedIndex(-1);
        jTextTipo.setText("");
        jTextDes.setText("");
        jTextImporte.setText("");
        jRadio.setSelected(false);
        jLabelID.setText("");
        
        
        
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
       
        
        
        
           int respuesta = JOptionPane.showOptionDialog(null, "¿Quieres eliminar el tratamiento?"+"\n"+" el tratamiento quedara almacenado en la base de datos "+"\n"+" no podra cargarse en la aplicacion", "ADVERTENCIA", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
        
               if (respuesta == JOptionPane.YES_OPTION) {
            
                   int id=Integer.parseInt(jLabelID.getText());
                       
                    tratdat.eliminarTratamiento(id);
                    cargarCombo();
            
                 } else if (respuesta == JOptionPane.NO_OPTION) {
            
                                                                }
        
         
        
    }//GEN-LAST:event_jBeliminarActionPerformed

     private void cargarCombo(){
   
               jCombo.removeAllItems();
               
              listtrata=(ArrayList) tratdat.obtenerTratamientos();
              
                for(Tratamiento t:listtrata){
                   jCombo.addItem(t);
    
                                            }
                
                      jCombo.setSelectedIndex(-1);
       
    
    }
    
   class FondoPanel extends JPanel{
        private Image Imagen;
      
        @Override
        public void paint (Graphics g){
            Image imagen = new ImageIcon(getClass().getResource("/imagen/Fondo1.png")).getImage();
            
             g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmod;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Tratamiento> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label jLabelID;
    private javax.swing.JRadioButton jRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextDes;
    private javax.swing.JTextField jTextImporte;
    private java.awt.TextField jTextTipo;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
