/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.iamriven.joyeria;

import org.eclipse.persistence.internal.jpa.parsing.IntegerLiteralNode;

/**
 *
 * @author Juan Antonio
 */
public class jPanel7updateEncantada extends javax.swing.JPanel {

    /**
     * Creates new form jPanel7updateNormal
     */
    public jPanel7updateEncantada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2AP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3Accuracy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4Evasion = new javax.swing.JTextField();
        jTextField1NombreJoyeria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1ActualizarJoyeria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1Nivel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1Nivel1 = new javax.swing.JComboBox<>();

        setName("cardupdateenchanted"); // NOI18N
        setPreferredSize(new java.awt.Dimension(722, 379));

        jTextField2AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2APActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("AP");

        jTextField3Accuracy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3AccuracyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Precisión");

        jTextField4Evasion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4EvasionActionPerformed(evt);
            }
        });

        jTextField1NombreJoyeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreJoyeriaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Evasión");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Actualizar joyeria encantada");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de la joyeria");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Precio");

        jButton1ActualizarJoyeria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1ActualizarJoyeria.setText("Actualizar");
        jButton1ActualizarJoyeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarJoyeriaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nivel antiguo");

        jComboBox1Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1Nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1NivelActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nuevo Nivel");

        jComboBox1Nivel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1Nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1Nivel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1ActualizarJoyeria,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 268,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField1NombreJoyeria,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                137,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jComboBox1Nivel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                85,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1Nivel1, 0, 1,
                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2AP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jTextField3Accuracy,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                70,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jTextField4Evasion,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                70,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jTextField5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                96,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)))
                                                .addGap(22, 22, 22)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1NombreJoyeria,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1Nivel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2AP,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField3Accuracy,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField4Evasion,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1Nivel1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1ActualizarJoyeria,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1Nivel1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1Nivel1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1Nivel1ActionPerformed

    private void jTextField2APActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2APActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2APActionPerformed

    private void jTextField3AccuracyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField3AccuracyActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField3AccuracyActionPerformed

    private void jTextField4EvasionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField4EvasionActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField4EvasionActionPerformed

    private void jTextField1NombreJoyeriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1NombreJoyeriaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField1NombreJoyeriaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActualizarJoyeriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActualizarJoyeriaActionPerformed
        String nombre = jTextField1NombreJoyeria.getText().toLowerCase();
        int nivel = 0;
        int nivelantiguo = 0;
        int ap = 0;
        int precision = 0;
        int evasion = 0;
        int precio = 0;

        if (nombre.isEmpty() || jTextField3Accuracy.getText().isEmpty()
                || jTextField4Evasion.getText().isEmpty() || jTextField5.getText().isEmpty()) {
            jTextArea1.setText("Los campos no pueden estar vacios.");

        } else {
            nivel = Integer.parseInt((String) jComboBox1Nivel.getSelectedItem());
            ap = Integer.parseInt(jComboBox1Nivel.getSelectedItem().toString().toLowerCase());
            precision = Integer.parseInt(jTextField3Accuracy.getText());
            evasion = Integer.parseInt(jTextField4Evasion.getText());
            precio = Integer.parseInt(jTextField5.getText());
            nivelantiguo = Integer.parseInt(jComboBox1Nivel1.getSelectedItem().toString().toLowerCase());

            JoyeriaSelect.actualizarJoyeriaEncantada(nombre, nivelantiguo, nivel, ap, precision, evasion, precio);
            jTextArea1.setText("Se ha actualizado una estadística a la joyería: " + nombre);
        }

    }// GEN-LAST:event_jButton1ActualizarJoyeriaActionPerformed

    private void jComboBox1NivelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1NivelActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1NivelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ActualizarJoyeria;
    private javax.swing.JComboBox<String> jComboBox1Nivel;
    private javax.swing.JComboBox<String> jComboBox1Nivel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1NombreJoyeria;
    private javax.swing.JTextField jTextField2AP;
    private javax.swing.JTextField jTextField3Accuracy;
    private javax.swing.JTextField jTextField4Evasion;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
