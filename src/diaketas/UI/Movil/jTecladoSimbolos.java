
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klyone
 */
public class jTecladoSimbolos extends javax.swing.JPanel {

    /**
     * Creates new form jTecladoSimbolos
     */
    public jTecladoSimbolos() {
        initComponents();
    }
    
    public jTecladoSimbolos(JTextField t) {
        initComponents();
        asociarCampo(t);
    }
    
    public void asociarCampo(JTextField t) {
        campo_texto = t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        binclinada1 = new javax.swing.JButton();
        admiracion_cerrada = new javax.swing.JButton();
        admiracion_abierta = new javax.swing.JButton();
        arroba = new javax.swing.JButton();
        dolar = new javax.swing.JButton();
        and = new javax.swing.JButton();
        binclinada2 = new javax.swing.JButton();
        parentesis_abierto = new javax.swing.JButton();
        parentesis_cerrado = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        interrogacion_cerrada = new javax.swing.JButton();
        interrogacion_abierta = new javax.swing.JButton();
        por = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        guion = new javax.swing.JButton();
        guion_bajo = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        punto_coma = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        dos_puntos = new javax.swing.JButton();

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        binclinada1.setText("\\");
            binclinada1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    binclinada1ActionPerformed(evt);
                }
            });

            admiracion_cerrada.setText("!");
            admiracion_cerrada.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    admiracion_cerradaActionPerformed(evt);
                }
            });

            admiracion_abierta.setText("¡");
            admiracion_abierta.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    admiracion_abiertaActionPerformed(evt);
                }
            });

            arroba.setText("@");
            arroba.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    arrobaActionPerformed(evt);
                }
            });

            dolar.setText("$");
            dolar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dolarActionPerformed(evt);
                }
            });

            and.setText("&");
            and.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    andActionPerformed(evt);
                }
            });

            binclinada2.setText("/");
            binclinada2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    binclinada2ActionPerformed(evt);
                }
            });

            parentesis_abierto.setText("(");
            parentesis_abierto.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    parentesis_abiertoActionPerformed(evt);
                }
            });

            parentesis_cerrado.setText(")");
            parentesis_cerrado.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    parentesis_cerradoActionPerformed(evt);
                }
            });

            igual.setText("=");
            igual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    igualActionPerformed(evt);
                }
            });

            interrogacion_cerrada.setText("?");
            interrogacion_cerrada.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    interrogacion_cerradaActionPerformed(evt);
                }
            });

            interrogacion_abierta.setText("¿");
            interrogacion_abierta.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    interrogacion_abiertaActionPerformed(evt);
                }
            });

            por.setText("*");
            por.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    porActionPerformed(evt);
                }
            });

            mas.setText("+");
            mas.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    masActionPerformed(evt);
                }
            });

            guion.setText("-");
            guion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    guionActionPerformed(evt);
                }
            });

            guion_bajo.setText("_");
            guion_bajo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    guion_bajoActionPerformed(evt);
                }
            });

            coma.setText(",");
            coma.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    comaActionPerformed(evt);
                }
            });

            punto_coma.setText(";");
            punto_coma.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    punto_comaActionPerformed(evt);
                }
            });

            punto.setText(".");
            punto.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    puntoActionPerformed(evt);
                }
            });

            dos_puntos.setText(":");
            dos_puntos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dos_puntosActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(binclinada1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(interrogacion_cerrada, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(interrogacion_abierta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(admiracion_cerrada, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(admiracion_abierta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(arroba, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mas, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dolar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(binclinada2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(parentesis_abierto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(parentesis_cerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(guion_bajo, javax.swing.GroupLayout.DEFAULT_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(guion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(punto_coma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dos_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nueve, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cero, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(binclinada1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admiracion_cerrada, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admiracion_abierta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arroba, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dolar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(and, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(binclinada2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parentesis_abierto, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parentesis_cerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(interrogacion_cerrada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(interrogacion_abierta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mas, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guion_bajo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guion, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(punto_coma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(punto, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dos_puntos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(uno.getText());
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
        actualizaCampo(dos.getText());
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        actualizaCampo(tres.getText());
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
        actualizaCampo(cuatro.getText());
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(cinco.getText());
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        actualizaCampo(seis.getText());
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        // TODO add your handling code here:
        actualizaCampo(siete.getText());
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(ocho.getText());
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        // TODO add your handling code here:
        actualizaCampo(nueve.getText());
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        // TODO add your handling code here:
        actualizaCampo(cero.getText());
    }//GEN-LAST:event_ceroActionPerformed

    private void binclinada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binclinada1ActionPerformed
        // TODO add your handling code here:
        actualizaCampo(binclinada1.getText());
    }//GEN-LAST:event_binclinada1ActionPerformed

    private void admiracion_cerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiracion_cerradaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(admiracion_cerrada.getText());
    }//GEN-LAST:event_admiracion_cerradaActionPerformed

    private void admiracion_abiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiracion_abiertaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(admiracion_abierta.getText());
    }//GEN-LAST:event_admiracion_abiertaActionPerformed

    private void arrobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrobaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(arroba.getText());
    }//GEN-LAST:event_arrobaActionPerformed

    private void dolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dolarActionPerformed
        // TODO add your handling code here:
        actualizaCampo(dolar.getText());
    }//GEN-LAST:event_dolarActionPerformed

    private void andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andActionPerformed
        // TODO add your handling code here:
        actualizaCampo(and.getText());
    }//GEN-LAST:event_andActionPerformed

    private void binclinada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binclinada2ActionPerformed
        // TODO add your handling code here:
        actualizaCampo(binclinada2.getText());
    }//GEN-LAST:event_binclinada2ActionPerformed

    private void parentesis_abiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesis_abiertoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(parentesis_abierto.getText());
    }//GEN-LAST:event_parentesis_abiertoActionPerformed

    private void parentesis_cerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesis_cerradoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(parentesis_cerrado.getText());
    }//GEN-LAST:event_parentesis_cerradoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        actualizaCampo(igual.getText());
    }//GEN-LAST:event_igualActionPerformed

    private void interrogacion_cerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interrogacion_cerradaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(interrogacion_cerrada.getText());
    }//GEN-LAST:event_interrogacion_cerradaActionPerformed

    private void interrogacion_abiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interrogacion_abiertaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(interrogacion_abierta.getText());
    }//GEN-LAST:event_interrogacion_abiertaActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        // TODO add your handling code here:
        actualizaCampo(por.getText());
    }//GEN-LAST:event_porActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        // TODO add your handling code here:
        actualizaCampo(mas.getText());
    }//GEN-LAST:event_masActionPerformed

    private void guionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guionActionPerformed
        // TODO add your handling code here:
        actualizaCampo(guion.getText());
    }//GEN-LAST:event_guionActionPerformed

    private void guion_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guion_bajoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(guion_bajo.getText());
    }//GEN-LAST:event_guion_bajoActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(coma.getText());
    }//GEN-LAST:event_comaActionPerformed

    private void punto_comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punto_comaActionPerformed
        // TODO add your handling code here:
        actualizaCampo(punto_coma.getText());
    }//GEN-LAST:event_punto_comaActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        // TODO add your handling code here:
        actualizaCampo(punto.getText());
    }//GEN-LAST:event_puntoActionPerformed

    private void dos_puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos_puntosActionPerformed
        // TODO add your handling code here:
        actualizaCampo(dos_puntos.getText());
    }//GEN-LAST:event_dos_puntosActionPerformed

    private void actualizaCampo(String caracter) {
        String a,b; 
        int pos = campo_texto.getCaretPosition(); 
        //campo_texto.setText(campo_texto.getText()+caracter);
        
        if(campo_texto.getText().length() < 30){
            a = campo_texto.getText().substring(0,pos);
            a = a+caracter;
            b = campo_texto.getText().substring(pos,campo_texto.getText().length());
            campo_texto.setText(a+b);
            
            campo_texto.setCaretPosition(pos+1);
        }
         
        campo_texto.getCaret().setVisible(true);
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admiracion_abierta;
    private javax.swing.JButton admiracion_cerrada;
    private javax.swing.JButton and;
    private javax.swing.JButton arroba;
    private javax.swing.JButton binclinada1;
    private javax.swing.JButton binclinada2;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton coma;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dolar;
    private javax.swing.JButton dos;
    private javax.swing.JButton dos_puntos;
    private javax.swing.JButton guion;
    private javax.swing.JButton guion_bajo;
    private javax.swing.JButton igual;
    private javax.swing.JButton interrogacion_abierta;
    private javax.swing.JButton interrogacion_cerrada;
    private javax.swing.JButton mas;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton parentesis_abierto;
    private javax.swing.JButton parentesis_cerrado;
    private javax.swing.JButton por;
    private javax.swing.JButton punto;
    private javax.swing.JButton punto_coma;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
    private JTextField campo_texto = null;
}
