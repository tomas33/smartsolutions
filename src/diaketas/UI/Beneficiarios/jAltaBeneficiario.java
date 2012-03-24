/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.ConexionBD;
import diaketas.UI.UI;
import diaketas.Usuarios.Beneficiario.Beneficiario;
import diaketas.Usuarios.Beneficiario.Gestor_de_beneficiarios;
import diaketas.Usuarios.ONG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kesada
 */
public class jAltaBeneficiario extends javax.swing.JPanel {

    JPanel panel;
    /**
     * Creates new form jAltaBeneficiario
     */
    public jAltaBeneficiario() {
        
        /*Inicialiamos UI*/
        initComponents();
        
        /*Rellenamos las listas de opciones de forma dinamica*/
        ConexionBD con = new ConexionBD();
        Statement s;
        ResultSet rs;
        try {

            con.conectarBD();
            
            //Crear objeto Statement para realizar queries a la base de datos
            s = con.conexion().createStatement();

            rs = s.executeQuery("SHOW COLUMNS FROM Beneficiario where Field = 'Estado_Civil'");

            while (rs.next()) {
                Object[] fila = new Object[3];
                fila[0] = rs.getObject(2);
                String[] tokens = (fila[0].toString()).split("'");
                for (int i = 0; i < tokens.length; i++) {
                    if (tokens[i].compareTo(",") != 0 && tokens[i].compareTo("enum(") != 0 && tokens[i].compareTo(")") != 0) {
                        Estado_Civil.addItem(tokens[i]);
                    }
                }

            }

            rs = s.executeQuery("SHOW COLUMNS FROM Beneficiario where Field = 'Tipo_Vivienda'");

            while (rs.next()) {
                Object[] fila = new Object[3];
                fila[0] = rs.getObject(2);
                String[] tokens = (fila[0].toString()).split("'");
                for (int i = 0; i < tokens.length; i++) {
                    if (tokens[i].compareTo(",") != 0 && tokens[i].compareTo("enum(") != 0 && tokens[i].compareTo(")") != 0) {
                        Tipo_Vivienda.addItem(tokens[i]);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
         finally {
            if (con.hayConexionBD()) {
                try {
                    con.desconectarBD();
                } catch (SQLException ex) {
                    Logger.getLogger(jAltaBeneficiario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        Tipo_Vivienda = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Fecha_Nacimiento = new javax.swing.JFormattedTextField();
        NIF_Voluntario = new javax.swing.JTextField();
        Domicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nacionalidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Localidad = new javax.swing.JTextField();
        botonCancel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        Motivo = new javax.swing.JTextArea();
        NIF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Estado_Civil = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Precio_Vivienda = new javax.swing.JFormattedTextField();
        Telefono = new javax.swing.JFormattedTextField();
        Codigo_Postal = new javax.swing.JFormattedTextField();

        jLabel9.setText("Domicilio");

        Tipo_Vivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel7.setText("Nacionalidad");

        Apellidos.setColumns(30);
        Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosKeyTyped(evt);
            }
        });

        jLabel20.setText("NIF Voluntario");

        Fecha_Nacimiento.setColumns(9);
        Fecha_Nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        Fecha_Nacimiento.setText("d/mm/aa");

        NIF_Voluntario.setBackground(new java.awt.Color(255, 255, 153));
        NIF_Voluntario.setColumns(9);
        NIF_Voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_VoluntarioKeyTyped(evt);
            }
        });

        Domicilio.setColumns(30);
        Domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DomicilioKeyTyped(evt);
            }
        });

        jLabel10.setText("Codigo Postal");

        jLabel4.setText("Nombre");

        jLabel8.setText("Estado civil");

        jLabel6.setText("Nacimiento");

        Nacionalidad.setColumns(20);
        Nacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NacionalidadKeyTyped(evt);
            }
        });

        jLabel15.setText("Motivo");

        Localidad.setColumns(20);
        Localidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LocalidadKeyTyped(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        Motivo.setColumns(20);
        Motivo.setRows(5);
        Motivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MotivoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Motivo);

        NIF.setColumns(9);
        NIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIFKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Dar de alta a un beneficiario");

        Estado_Civil.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Situación economica");

        jLabel11.setText("Localidad");

        jLabel2.setText("NIF");

        jLabel12.setText("Telefono");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jLabel18.setText("Precio Vivienda");

        Nombre.setColumns(20);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Vivienda");

        jLabel5.setText("Apellidos");

        jLabel17.setText("Tipo");

        jLabel16.setText("Email");

        Email.setColumns(20);
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        Precio_Vivienda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        Telefono.setColumns(9);
        try {
            Telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Codigo_Postal.setColumns(9);
        try {
            Codigo_Postal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel5))
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Estado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Codigo_Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(87, 87, 87)))
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Tipo_Vivienda, 0, 128, Short.MAX_VALUE)
                                            .addComponent(Precio_Vivienda)))))
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(botonOK, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancel))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Estado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Codigo_Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Tipo_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Precio_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        UI.cl.show(UI.jPrincipal, "Beneficiarios");
    }//GEN-LAST:event_botonCancelActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed

        if (NIF_Voluntario.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(this, "El NIF del voluntario no se ha introducido.", "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
        }else{
            panel = new jFamiliar();
            
            /*---------Introducir datos del familiar---------------*/
            
            /*Conversion de la fecha*/
            Date Fecha_Nac = null;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
            try {
                Fecha_Nac = formatoFecha.parse(Fecha_Nacimiento.getText());
            } catch (ParseException ex) {
                Logger.getLogger(jAltaBeneficiario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Fecha de nacimiento incorrecto, utilice formato dd/MM/yy.", "Fecha de Nacimiento", JOptionPane.ERROR_MESSAGE);
            }

            /*1. IntroducirDatosBeneficiario(datosBeneficiario, dniVoluntario)*/
            boolean correcto = Gestor_de_beneficiarios.introducirDatosBeneficiario(
                    NIF.getText().toUpperCase(),
                    Nombre.getText(),
                    Apellidos.getText(),
                    Fecha_Nac, Localidad.getText(),
                    Email.getText(),
                    (Telefono.getText().compareTo("         ")==0? 0 : Integer.parseInt(Telefono.getText())),
                    Nacionalidad.getText(),
                    (String)Estado_Civil.getSelectedItem(),
                    Domicilio.getText(),
                    (Codigo_Postal.getText().compareTo("     ")==0? 0 : Integer.parseInt(Codigo_Postal.getText())),
                    new Date(),
                    Motivo.getText(),
                    (Precio_Vivienda.getText().compareTo("")==0? 0.0 : Double.parseDouble(Precio_Vivienda.getText())),
                    (String)Tipo_Vivienda.getSelectedItem(),
                    NIF_Voluntario.getText());
 
            //REVISAR CORRECTO DEBE FUNCIONAR
            correcto = true;
            /* 2. finalizar() */
            if (correcto = false)
                JOptionPane.showMessageDialog(this, "No se ha encontrado ningún voluntario con ese NIF.",
                        "NIF Voluntario", JOptionPane.ERROR_MESSAGE);

            /* 3. ConfirmarAltaBeneficiario()*/
            Gestor_de_beneficiarios.confirmarAltaBeneficiario();
            
            /*Actualizamos la pantalla principal*/
            panel = new jFamiliar();
            UI.jPrincipal.add("Familiar", panel);
            UI.cl.show(UI.jPrincipal, "Familiar");
        }
    }//GEN-LAST:event_botonOKActionPerformed

    private void NIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIFKeyTyped
        if (NIF.getText().length()==9)
            evt.consume();
    }//GEN-LAST:event_NIFKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        if (Nombre.getText().length()==20)
            evt.consume();
    }//GEN-LAST:event_NombreKeyTyped

    private void ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosKeyTyped
        if (Apellidos.getText().length()==30)
            evt.consume();
    }//GEN-LAST:event_ApellidosKeyTyped

    private void LocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocalidadKeyTyped
        if (Localidad.getText().length()==20)
            evt.consume();
    }//GEN-LAST:event_LocalidadKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        if (Email.getText().length()==30)
            evt.consume();
    }//GEN-LAST:event_EmailKeyTyped

    private void NacionalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NacionalidadKeyTyped
        if (Nacionalidad.getText().length()==20)
            evt.consume();
    }//GEN-LAST:event_NacionalidadKeyTyped

    private void MotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MotivoKeyTyped
        if (Motivo.getText().length()==250)
            evt.consume();
    }//GEN-LAST:event_MotivoKeyTyped

    private void DomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DomicilioKeyTyped
        if (Domicilio.getText().length()==50)
            evt.consume();
    }//GEN-LAST:event_DomicilioKeyTyped

    private void NIF_VoluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_VoluntarioKeyTyped
        if (NIF_Voluntario.getText().length()==9)
            evt.consume();
    }//GEN-LAST:event_NIF_VoluntarioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JFormattedTextField Codigo_Postal;
    private javax.swing.JTextField Domicilio;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox Estado_Civil;
    private javax.swing.JFormattedTextField Fecha_Nacimiento;
    private javax.swing.JTextField Localidad;
    private javax.swing.JTextArea Motivo;
    private javax.swing.JTextField NIF;
    private javax.swing.JTextField NIF_Voluntario;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JTextField Nombre;
    private javax.swing.JFormattedTextField Precio_Vivienda;
    private javax.swing.JFormattedTextField Telefono;
    private javax.swing.JComboBox Tipo_Vivienda;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
