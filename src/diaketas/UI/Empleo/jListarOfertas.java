/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Empleo;

import diaketas.UI.UI;
import diaketas.Modelo.ONG.Beneficiario;
import diaketas.Modelo.ONG.Familiar;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import diaketas.Modelo.ONG.Oferta;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kesada
 */
public class jListarOfertas extends javax.swing.JPanel {

    JPanel panel;
    int jPanelSiguiente;
    ArrayList<Oferta> ofertasEncontradas = null;
    
    /**
     * Creates new form jBuscarBeneficiario
     * @param jPanelSiguiente 
     */
    public jListarOfertas(int jPanelSiguiente) {
        this.jPanelSiguiente = jPanelSiguiente;
        initComponents();
        
        switch(jPanelSiguiente) {
            case 0: // Consultar
                botonContinuar.setText("Consultar");
                break;
            case 1: // Modificar
                botonContinuar.setText("Modificar");
                break;
            case 2: // Crear
                botonContinuar.setText("Crear");
                break;
            case 3: // Eliminar
                botonContinuar.setText("Eliminar");
                break;
            case 4: // Asociar Beneficiario
                botonContinuar.setText("Asociar Beneficiario");
                break;
        }
        
        mensajeError.setVisible(false);
        //if (jPanelSiguiente != 2)
        botonContinuar.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jTitulo1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panel_busqueda = new javax.swing.JPanel();
        panel_parametros_busqueda = new javax.swing.JPanel();
        concepto_etiq = new javax.swing.JLabel();
        codigo_oferta_etiq = new javax.swing.JLabel();
        poblacion_etiq = new javax.swing.JLabel();
        codigo_oferta_input = new javax.swing.JTextField();
        poblacion_input = new javax.swing.JTextField();
        concepto_input = new javax.swing.JTextField();
        mensajeError = new javax.swing.JLabel();
        panel_botones_control = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        botonBuscarOfertas = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoOfertas = new javax.swing.JTable();

        setBackground(new java.awt.Color(233, 225, 242));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Buscar una oferta de empleo");

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Ofertas de empleo");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/empleo.png"))); // NOI18N

        panel_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        panel_busqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panel_parametros_busqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        concepto_etiq.setText("Concepto:");

        codigo_oferta_etiq.setText("Código de oferta:");

        poblacion_etiq.setText("Población:");

        codigo_oferta_input.setColumns(9);
        codigo_oferta_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo_oferta_inputKeyTyped(evt);
            }
        });

        poblacion_input.setColumns(9);
        poblacion_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                poblacion_inputKeyTyped(evt);
            }
        });

        concepto_input.setColumns(9);
        concepto_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                concepto_inputKeyTyped(evt);
            }
        });

        mensajeError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(242, 9, 9));
        mensajeError.setText("Error: No se ha seleccionado ninguna oferta");

        javax.swing.GroupLayout panel_parametros_busquedaLayout = new javax.swing.GroupLayout(panel_parametros_busqueda);
        panel_parametros_busqueda.setLayout(panel_parametros_busquedaLayout);
        panel_parametros_busquedaLayout.setHorizontalGroup(
            panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_parametros_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_parametros_busquedaLayout.createSequentialGroup()
                        .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_oferta_etiq)
                            .addComponent(concepto_etiq)
                            .addComponent(poblacion_etiq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigo_oferta_input, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(concepto_input)
                            .addComponent(poblacion_input)))
                    .addGroup(panel_parametros_busquedaLayout.createSequentialGroup()
                        .addComponent(mensajeError)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_parametros_busquedaLayout.setVerticalGroup(
            panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_parametros_busquedaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_oferta_etiq)
                    .addComponent(codigo_oferta_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concepto_etiq)
                    .addComponent(concepto_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_parametros_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poblacion_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poblacion_etiq))
                .addGap(18, 18, 18)
                .addComponent(mensajeError)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel_botones_control.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonBuscarOfertas.setText("Buscar");
        botonBuscarOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarOfertasActionPerformed(evt);
            }
        });

        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botones_controlLayout = new javax.swing.GroupLayout(panel_botones_control);
        panel_botones_control.setLayout(panel_botones_controlLayout);
        panel_botones_controlLayout.setHorizontalGroup(
            panel_botones_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botones_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botones_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscarOfertas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_botones_controlLayout.setVerticalGroup(
            panel_botones_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonBuscarOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
        panel_busqueda.setLayout(panel_busquedaLayout);
        panel_busquedaLayout.setHorizontalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_parametros_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_botones_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_busquedaLayout.setVerticalGroup(
            panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_parametros_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_botones_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listadoOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Fecha", "Población", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listadoOfertas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        listadoOfertas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listadoOfertas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(69, 69, 69)
                .addComponent(jTitulo1)
                .addGap(0, 635, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTitulo2)
                    .addComponent(panel_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
      
    }//GEN-LAST:event_formComponentResized

    private void codigo_oferta_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_oferta_inputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_oferta_inputKeyTyped

    private void poblacion_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poblacion_inputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_poblacion_inputKeyTyped

    private void concepto_inputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_concepto_inputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_concepto_inputKeyTyped

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        UI.cl.show(UI.jPrincipal, "Empleo");
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonBuscarOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarOfertasActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabla = (DefaultTableModel) listadoOfertas.getModel();
        int nofertas;
        int entradas_tabla = tabla.getRowCount();
        
        int codigo = -1;
        String codigo_aux = this.codigo_oferta_input.getText();
        String concepto = this.concepto_input.getText();
        String poblacion = this.poblacion_input.getText();
        
        
        for(int i = 0 ; i < entradas_tabla ; i++)
            tabla.removeRow(i);
        
        
        if(codigo_aux.compareTo("") != 0)
            codigo = Integer.parseInt(codigo_aux);
        
        if(concepto.compareTo("") == 0)
            concepto = null;
        
        if(poblacion.compareTo("") == 0)
            poblacion = null;
        
        ofertasEncontradas = diaketas.diaketas.ong.gestorOfertas.filtrarOfertas(codigo,concepto,poblacion);
        
        nofertas = ofertasEncontradas.size();
        
        if(nofertas != 0) {
            Oferta oferta_actual;
            Object[] fila = new Object[4];
            for(int i = 0 ; i < nofertas ; i++) {
                oferta_actual = ofertasEncontradas.get(i);
                // ¿Accedemos directamente?
                fila[0] = oferta_actual.concepto;
                fila[1] = oferta_actual.fecha;
                fila[2] = oferta_actual.poblacion;
                fila[3] = oferta_actual.salario;
                
                tabla.addRow(fila);
            }
            botonContinuar.setEnabled(true);
        }
        else
            botonContinuar.setEnabled(false);
    }//GEN-LAST:event_botonBuscarOfertasActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // TODO add your handling code here:
        
        int oferta_seleccionada = listadoOfertas.getSelectedRow();
        
        if(oferta_seleccionada != -1) {
            diaketas.diaketas.ong.gestorOfertas.seleccionarOferta(ofertasEncontradas.get(oferta_seleccionada).cod_oferta);
            
            switch(jPanelSiguiente) {
                case 0: // Consultar
                        panel = new jConsultarOferta();
                        UI.jPrincipal.add("ConsultarOferta", panel);
                        UI.cl.show(UI.jPrincipal, "ConsultarOferta");  
               
                break;
                case 1: // Modificar
                    panel = new jModificarOferta();
                    UI.jPrincipal.add("ModificarOferta", panel);
                    UI.cl.show(UI.jPrincipal, "ModificarOferta");  
               
                break;
                case 2: // Crear
                    panel = new jCrearOferta();
                    UI.jPrincipal.add("CrearOferta", panel);
                    UI.cl.show(UI.jPrincipal, "CrearOferta"); 
                break;
                case 3: // Eliminar
                    panel = new jEliminarOferta();
                    UI.jPrincipal.add("EliminarOferta", panel);
                    UI.cl.show(UI.jPrincipal, "EliminarOferta"); 
                break;
                case 4: // Asociar Beneficiario
                    panel = new jAsociarBeneficiario();
                    UI.jPrincipal.add("AsociarBeneficiario", panel);
                    UI.cl.show(UI.jPrincipal, "AsociarBeneficiario");  
                   
               break;
            }
        }
        else {
            mensajeError.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_botonContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarOfertas;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel codigo_oferta_etiq;
    private javax.swing.JTextField codigo_oferta_input;
    private javax.swing.JLabel concepto_etiq;
    private javax.swing.JTextField concepto_input;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JTable listadoOfertas;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JPanel panel_botones_control;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_parametros_busqueda;
    private javax.swing.JLabel poblacion_etiq;
    private javax.swing.JTextField poblacion_input;
    // End of variables declaration//GEN-END:variables
}
