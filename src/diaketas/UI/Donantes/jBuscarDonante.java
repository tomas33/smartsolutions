/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Donantes;

import diaketas.UI.UI;
import diaketas.Usuarios.Donante.Gestor_de_donantes;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kesada
 */
public class jBuscarDonante extends javax.swing.JPanel {

    JPanel panel;
    jModificarDonante modificarSocio;
    String jPanelSiguiente;
    
    /**
     * Creates new form jBuscarDonante
     */
    public jBuscarDonante(String jPanelSiguiente) {
        this.jPanelSiguiente = jPanelSiguiente;
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIF_CIF = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Donantes");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Buscar Donantes por NIF");

        jLabel2.setText("NIF");

        NIF_CIF.setColumns(9);
        NIF_CIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_CIFKeyTyped(evt);
            }
        });

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(55, 55, 55)
                                                .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(198, 198, 198))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(botonConsultar)))
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonConsultar)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        if (jPanelSiguiente.compareTo("ConsultarSocio") ==0)
        {
            
            if(Gestor_de_donantes.introducirDniDonante(NIF_CIF.getText())){
                
                //Pasamos el donante devuelto al nuevo panel
                
                panel = new jConsultarDonante(Gestor_de_donantes.confimarConsulta());
                UI.jPrincipal.add(jPanelSiguiente, panel); 
                UI.cl.show(UI.jPrincipal, jPanelSiguiente);
            
            }else{
                JOptionPane.showMessageDialog(this, "No existe ningun donante con dicho DNI", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
         }else{
            
            if(Gestor_de_donantes.introducirDniDonante(NIF_CIF.getText())){

                panel = new jModificarDonante(Gestor_de_donantes.confimarConsulta());
                UI.jPrincipal.add(jPanelSiguiente, panel); 
                UI.cl.show(UI.jPrincipal, jPanelSiguiente); 

            }else{
                JOptionPane.showMessageDialog(this, "No existe ningun donante con dicho DNI", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void NIF_CIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_CIFKeyTyped
        if (NIF_CIF.getText().length()==9)
            evt.consume(); 
    }//GEN-LAST:event_NIF_CIFKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF_CIF;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}