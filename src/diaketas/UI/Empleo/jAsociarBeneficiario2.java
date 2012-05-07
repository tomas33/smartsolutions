/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Empleo;

import diaketas.UI.UI;
import javax.swing.JPanel;

/**
 * Formulario que se encarga de validar la identidad del voluntario que va a
 * realizar la operación de asociar un beneficiario a la oferta seleccionada
 * previamente.
 * @author Miguel Jiménez López
 */
public class jAsociarBeneficiario2 extends javax.swing.JPanel {

    /**
     * Creates new form jAsociarBeneficiario2
     */
    public jAsociarBeneficiario2() {
        initComponents();
        
        mensajeError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTitulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panel_busqueda = new javax.swing.JPanel();
        panel_entradas = new javax.swing.JPanel();
        dni_responsable_etiq = new javax.swing.JLabel();
        dni_responsable_input = new javax.swing.JTextField();
        panel_botones = new javax.swing.JPanel();
        botonConfirmarAsociacion = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 225, 242));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/empleo.png"))); // NOI18N

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Ofertas de empleo");

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Confirmar la operación");

        panel_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        panel_busqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panel_entradas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dni_responsable_etiq.setText("DNI del responsable:");

        dni_responsable_input.setColumns(9);
        dni_responsable_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dni_responsable_inputKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_entradasLayout = new javax.swing.GroupLayout(panel_entradas);
        panel_entradas.setLayout(panel_entradasLayout);
        panel_entradasLayout.setHorizontalGroup(
            panel_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dni_responsable_etiq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dni_responsable_input, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_entradasLayout.setVerticalGroup(
            panel_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entradasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni_responsable_etiq)
                    .addComponent(dni_responsable_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel_botones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonConfirmarAsociacion.setText("Confirmar");
        botonConfirmarAsociacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarAsociacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonConfirmarAsociacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmarAsociacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mensajeError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(242, 9, 9));
        mensajeError.setText("Error: El DNI no es correcto");

        javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
        panel_busqueda.setLayout(panel_busquedaLayout);
        panel_busquedaLayout.setHorizontalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_entradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_busquedaLayout.createSequentialGroup()
                        .addComponent(mensajeError)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_busquedaLayout.setVerticalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensajeError)
                .addGap(18, 18, 18)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTitulo2)
                        .addGap(590, 590, 590))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel17)
                                .addGap(69, 69, 69)
                                .addComponent(jTitulo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jTitulo1))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dni_responsable_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_responsable_inputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_responsable_inputKeyTyped

    private void botonConfirmarAsociacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarAsociacionActionPerformed
        // TODO add your handling code here:
        
        String dni_voluntario = this.dni_responsable_input.getText();
        boolean autorizado = false;
        
        if(dni_voluntario.compareTo("") != 0) {
            autorizado = diaketas.diaketas.ong.gestorOfertas.comprobarVoluntario(dni_voluntario);
            
            if(autorizado) {
                // Registrar la operacion y asociar al beneficiario con la oferta
                diaketas.diaketas.ong.gestorOfertas.finAsociar();
                panel = new jAsociarBeneficiario3();

                UI.jPrincipal.add("AsociarBeneficiarioOferta3", panel);
                UI.cl.show(UI.jPrincipal, "AsociarBeneficiarioOferta3");
            }
            else {
                this.mensajeError.setText("Error: No existe el voluntario");
                this.mensajeError.setVisible(true);
            }
        }
        else {
            this.mensajeError.setText("Error: Introduzca el DNI");
            mensajeError.setVisible(true);
        }
    }//GEN-LAST:event_botonConfirmarAsociacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfirmarAsociacion;
    private javax.swing.JLabel dni_responsable_etiq;
    private javax.swing.JTextField dni_responsable_input;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_entradas;
    // End of variables declaration//GEN-END:variables
    
    private JPanel panel;

}
