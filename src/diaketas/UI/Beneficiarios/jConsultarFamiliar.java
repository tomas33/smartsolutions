/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Usuarios.Beneficiario.Familiar;
import diaketas.Usuarios.Beneficiario.Gestor_de_beneficiarios;
import diaketas.Usuarios.Beneficiario.Parentesco;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author kesada
 */
public class jConsultarFamiliar extends javax.swing.JPanel {

    String jPanelSiguiente;
    String NombreApellidos;
    
    /**
     * Creates new form jAltaFamiliar
     */
    public jConsultarFamiliar(String jPanelSiguiente, String Nombre_Apellidos) {
        
        this.jPanelSiguiente = jPanelSiguiente;
        
        this.NombreApellidos = Nombre_Apellidos;
        
        /*Inicializamos UI*/
        initComponents();
        
                /*Inicializamos los datos*/
        ArrayList datosFamiliar = Gestor_de_beneficiarios.consultarFamiliar(Nombre_Apellidos);
        Familiar familiar = (Familiar) datosFamiliar.get(0);
        Parentesco parentesco = (Parentesco) datosFamiliar.get(1);
        
        /*Actualizamos los valores del formulario*/
        this.Nombre_Apellidos.setText(familiar.Nombre_Apellidos);
        this.Ocupacion.setText(familiar.Ocupacion);
        this.Parentesco.setText(parentesco.Parentesc);
        
        /* Representamos la fecha*/
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
        this.Fecha_Nacimiento.setText(formatoFecha.format(familiar.Fecha_Nacimiento));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Apellidos = new javax.swing.JLabel();
        Fecha_Nacimiento = new javax.swing.JLabel();
        Parentesco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ocupacion = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();

        jLabel6.setText("Nacimiento");

        jLabel2.setText("Nombre y Apellidos");

        jLabel8.setText("Parentesco");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Consultar familiar");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios");

        jLabel7.setText("Ocupacion");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nombre_Apellidos)
                                        .addComponent(Fecha_Nacimiento)
                                        .addComponent(Parentesco)
                                        .addComponent(Ocupacion)
                                        .addComponent(botonOK))
                                    .addGap(198, 198, 198)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre_Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Fecha_Nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Parentesco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ocupacion))
                .addGap(29, 29, 29)
                .addComponent(botonOK)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        UI.cl.show(UI.jPrincipal, jPanelSiguiente);
    }//GEN-LAST:event_botonOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha_Nacimiento;
    private javax.swing.JLabel Nombre_Apellidos;
    private javax.swing.JLabel Ocupacion;
    private javax.swing.JLabel Parentesco;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
