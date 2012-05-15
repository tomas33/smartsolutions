
import javax.swing.JTextField;
import java.lang.reflect.Field;
import java.awt.Component;
import java.awt.event.*;
import java.awt.AWTEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klyone
 */
public class jTeclado extends javax.swing.JPanel {

    /**
     * Creates new form jTeclado
     */
    
    public jTeclado() {
        initComponents();
    }
    
    public jTeclado(JTextField t) {
        campo_texto = t;
        initComponents();
        campo_texto.getCaret().setVisible(true);
    }
    
    public void asociarCampo(JTextField t) {
        campo_texto = t;
        jTecladoLetras2.asociarCampo(t);
        jTecladoSimbolos2.asociarCampo(t);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Mayus = new javax.swing.JButton();
        Simbolos = new javax.swing.JButton();
        Backspace = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        Adelante = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        teclado = new javax.swing.JLayeredPane();
        jTecladoSimbolos2 = new jTecladoSimbolos(campo_texto);
        jTecladoLetras2 = new jTecladoLetras(campo_texto);

        Mayus.setText("Mayus");
        Mayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayusActionPerformed(evt);
            }
        });

        Simbolos.setText("Simbolos");
        Simbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimbolosActionPerformed(evt);
            }
        });

        Backspace.setText("Borrar");
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });

        Atras.setText("<");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Adelante.setText(">");
        Adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdelanteActionPerformed(evt);
            }
        });

        ok.setText("Aceptar");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Simbolos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mayus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Adelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mayus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Simbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTecladoSimbolos2.setVisible(false);
        jTecladoSimbolos2.setBounds(10, 40, 648, 170);
        teclado.add(jTecladoSimbolos2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTecladoLetras2.setBounds(10, 0, 658, 304);
        teclado.add(jTecladoLetras2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teclado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayusActionPerformed
        // TODO add your handling code here:
        if(letras_activas) {
            this.jTecladoLetras2.cambiarModoMayus();
            repaint();
        }
        else {
            this.jTecladoSimbolos2.setVisible(false);
            this.jTecladoLetras2.setVisible(true);
            letras_activas = true;
        }
    }//GEN-LAST:event_MayusActionPerformed

    private void SimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimbolosActionPerformed
        // TODO add your handling code here:
        if(letras_activas) {
            this.jTecladoLetras2.setVisible(false);
            this.jTecladoSimbolos2.setVisible(true);
            letras_activas = false;
            repaint();
        }
    }//GEN-LAST:event_SimbolosActionPerformed

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceActionPerformed
        // TODO add your handling code here:
        int pos = campo_texto.getCaretPosition();
        boolean borrado = false;
        String a,b;
            
        if(campo_texto.getText().length() > 0 && pos > 0){
           a = campo_texto.getText().substring(0,pos-1);
           b = campo_texto.getText().substring(pos,campo_texto.getText().length());
           campo_texto.setText(a+b);
           borrado = true;
        }
       
        if(!borrado)
            campo_texto.setCaretPosition(pos);
        else
            campo_texto.setCaretPosition(pos-1); 
    }//GEN-LAST:event_BackspaceActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        int pos = campo_texto.getCaretPosition();
        if(pos > 0)
            campo_texto.setCaretPosition(pos-1);
    }//GEN-LAST:event_AtrasActionPerformed

    private void AdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdelanteActionPerformed
        // TODO add your handling code here:
        int pos = campo_texto.getCaretPosition();
        if(pos < campo_texto.getText().length())
            campo_texto.setCaretPosition(pos+1);
    }//GEN-LAST:event_AdelanteActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        try {
            KeyEvent ke = new KeyEvent(campo_texto, 
                KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, 
                KeyEvent.VK_ENTER, KeyEvent.CHAR_UNDEFINED);
            //campo_texto.requestFocusInWindow();
            campo_texto.dispatchEvent(ke);
        } catch (Exception ex) { }

        this.getParent().getParent().getParent().getParent().setVisible(false);
    }//GEN-LAST:event_okActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adelante;
    private javax.swing.JButton Atras;
    private javax.swing.JButton Backspace;
    private javax.swing.JButton Mayus;
    private javax.swing.JButton Simbolos;
    private javax.swing.JPanel jPanel2;
    private jTecladoLetras jTecladoLetras2;
    private jTecladoSimbolos jTecladoSimbolos2;
    private javax.swing.JButton ok;
    private javax.swing.JLayeredPane teclado;
    // End of variables declaration//GEN-END:variables
    private JTextField campo_texto = null;
    boolean letras_activas = true;
}
