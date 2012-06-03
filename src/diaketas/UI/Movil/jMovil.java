/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Movil;

import java.awt.Font;
import javax.swing.JOptionPane;
import diaketas.Modelo.ONG.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Sergio
 */
public class jMovil extends javax.swing.JFrame {

    protected jSTeclado teclado_virtual;
    protected Donante d = null;
    /**
     * Creates new form jMovil
     */
    public jMovil() {
        initComponents();
        teclado_virtual = new jSTeclado(dniText);
        
        double fuente = 15 + (this.getSize().width - 384) / 30;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            panel.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }
        
        this.setSize(512,384);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        dniText = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        cabecera = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        passText = new javax.swing.JPasswordField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diaketas");
        setAutoRequestFocus(false);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(512, 384));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        panel.setMinimumSize(new java.awt.Dimension(512, 384));
        panel.setPreferredSize(new java.awt.Dimension(512, 384));

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/aceptar.png"))); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        dniText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dniText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dniTextMouseClicked(evt);
            }
        });

        dniLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dniLabel.setText("DNI");

        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passLabel.setText("Contraseña");

        cabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabecera.setText("Introduzca sus datos");

        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(cabecera)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLabel)
                    .addComponent(dniLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dniText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(passText))
                .addGap(91, 91, 91))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cabecera)
                .addGap(49, 49, 49)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniLabel))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addGap(25, 25, 25)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        if(diaketas.diaketas.ong.gestorDonantes.identificarse(dniText.getText(),passText.getText())){
            UI ui = new UI();
            ui.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Los datos introducidos son erróneos.\nPor favor, introdúzcalos de nuevo", "Error de identificación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        int w = this.getSize().width, h = this.getSize().height;
        
        
        
        cabecera.setLocation(0,30*h/384);
        cabecera.setSize(w,30*h/384);
        ///
        aceptar.setLocation(277*w/512,229*h/384);
        aceptar.setSize(200*w/512,110*h/384);
        
        cancelar.setLocation(22*w/512,229*h/384);
        cancelar.setSize(200*w/512,110*h/384);
        
        dniText.setLocation(250*w/512,90*h/384);
        dniText.setSize(200*w/512,30*h/384);
        
        passText.setLocation(250*w/512,150*h/384);
        passText.setSize(200*w/512,30*h/384);
        
        dniLabel.setLocation(80*w/512,90*h/384);
        dniLabel.setSize(150*w/512,30*h/384);
        
        passLabel.setLocation(80*w/512,150*h/384);
        passLabel.setSize(150*w/512,30*h/384);
        
        separador.setLocation(0,200*h/384);
        separador.setSize(512*w/512,10*h/384);
    }//GEN-LAST:event_formComponentResized

    private void dniTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniTextMouseClicked
        // TODO add your handling code here:
        teclado_virtual.asociarCampo(dniText);
        teclado_virtual.activar();
    }//GEN-LAST:event_dniTextMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void passTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMouseClicked
        // TODO add your handling code here:
        teclado_virtual.asociarCampo(passText);
        teclado_virtual.activar();
    }//GEN-LAST:event_passTextMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel cabecera;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniText;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passText;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("diaketas/Iconos/diaketas.png"));


        return retValue;
    }

    public void setAutoRequestFocus(boolean b) {
        // quesada maricon
    }
}
