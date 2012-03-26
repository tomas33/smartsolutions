/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI;

import diaketas.UI.Donantes.jDonantes;
import diaketas.UI.Empleo.jEmpleo;
import diaketas.UI.Donaciones.jDonaciones;
import diaketas.UI.Diaketas.jDiaketas;
import diaketas.UI.Beneficiarios.*;
import de.javasoft.plaf.synthetica.*;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author kesada
 */
public class UI extends javax.swing.JFrame {
    
    public static CardLayout cl;
     
    /**
     * Creates new form Main
     */
    public UI() {
        initComponents();
        jPrincipalScroll.getViewport().setView(jPrincipal);
        cl = (CardLayout)(jPrincipal.getLayout());
        
        /*Paneles acciones */
        /*Categorias principales jPrincipal*/
        JPanel beneficiarios = new jBeneficiario();
        JPanel diaketas = new jDiaketas();
        JPanel donaciones = new jDonaciones();
        JPanel empleo = new jEmpleo();
        JPanel socios = new jDonantes();
       
        
        /*JPrincipal*/
        jPrincipal.add("Socios", socios);
        jPrincipal.add("Empleo", empleo);
        jPrincipal.add("Donaciones", donaciones);
        jPrincipal.add("Diaketas", diaketas);
        jPrincipal.add("Beneficiarios", beneficiarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBotones = new javax.swing.JPanel();
        botonDiaketas = new javax.swing.JButton();
        botonSocios = new javax.swing.JButton();
        botonBeneficiarios = new javax.swing.JButton();
        botonDonaciones = new javax.swing.JButton();
        botonEmpleo = new javax.swing.JButton();
        jPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPrincipalScroll = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 900));

        jMenuBotones.setLayout(new java.awt.GridLayout(1, 0));

        botonDiaketas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Home.png"))); // NOI18N
        botonDiaketas.setText("Diaketas");
        botonDiaketas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiaketasActionPerformed(evt);
            }
        });
        jMenuBotones.add(botonDiaketas);

        botonSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Socios.gif"))); // NOI18N
        botonSocios.setText("Donantes");
        botonSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSociosActionPerformed(evt);
            }
        });
        jMenuBotones.add(botonSocios);

        botonBeneficiarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N
        botonBeneficiarios.setText("Beneficiarios");
        botonBeneficiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBeneficiariosActionPerformed(evt);
            }
        });
        jMenuBotones.add(botonBeneficiarios);

        botonDonaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Donaciones.png"))); // NOI18N
        botonDonaciones.setText("Donaciones");
        botonDonaciones.setEnabled(false);
        botonDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDonacionesActionPerformed(evt);
            }
        });
        jMenuBotones.add(botonDonaciones);

        botonEmpleo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/empleo.png"))); // NOI18N
        botonEmpleo.setText("Empleo");
        botonEmpleo.setEnabled(false);
        botonEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleoActionPerformed(evt);
            }
        });
        jMenuBotones.add(botonEmpleo);

        getContentPane().add(jMenuBotones, java.awt.BorderLayout.NORTH);

        jPrincipal.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Pantalla de presentacion estadisticas? logo? que?");
        jPrincipal.add(jLabel1, "card2");

        getContentPane().add(jPrincipal, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPrincipalScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBeneficiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBeneficiariosActionPerformed
        /*Modificamos zona principal*/
        cl.show(jPrincipal, "Beneficiarios");

    }//GEN-LAST:event_botonBeneficiariosActionPerformed

    private void botonDiaketasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiaketasActionPerformed
        /*Modificamos zona principal*/
        cl.show(jPrincipal, "Diaketas");
    }//GEN-LAST:event_botonDiaketasActionPerformed

    private void botonDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDonacionesActionPerformed
        /*Modificamos zona principal*/
        cl.show(jPrincipal, "Donaciones");
    }//GEN-LAST:event_botonDonacionesActionPerformed

    private void botonEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleoActionPerformed
        /*Modificamos zona principal*/
        cl.show(jPrincipal, "Empleo");
    }//GEN-LAST:event_botonEmpleoActionPerformed

    private void botonSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSociosActionPerformed
        /*Modificamos zona principal*/
        cl.show(jPrincipal, "Socios");
    }//GEN-LAST:event_botonSociosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         *//*
        try {
    UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
} catch (Exception e) {
    e.printStackTrace();
}/*
        try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());                

                    } catch (Exception e) {
                    }
        *//*
        try{
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");                
        } catch (Exception e) {
                    }
        */
        /*
        
        try{
                     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");        } catch (Exception e) {
        }*/
        
        try{
                     UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch (Exception e) {
        }/*
        try{
                     UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
        }*/
       /* try{
                     UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
        } catch (Exception e) {
        }
  /*      try{
                     UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
        } catch (Exception e) {
        }
*/  /*
        try{
                     UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        } catch (Exception e) {
        }*/
        /*
        try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");                
        } catch (Exception e) {
                    }
        */
        /*
        try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");                
        } catch (Exception e) {
                    }*/
        
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBeneficiarios;
    private javax.swing.JButton botonDiaketas;
    private javax.swing.JButton botonDonaciones;
    private javax.swing.JButton botonEmpleo;
    private javax.swing.JButton botonSocios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jMenuBotones;
    public static javax.swing.JPanel jPrincipal;
    private javax.swing.JScrollPane jPrincipalScroll;
    // End of variables declaration//GEN-END:variables
}
