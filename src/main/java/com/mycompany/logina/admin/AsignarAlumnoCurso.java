/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logina.admin;

import com.mycompany.logina.Administrador;
import com.mycompany.logina.Alumno;
import com.mycompany.logina.Curso;
import com.mycompany.logina.LoginA;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andy2
 */
public class AsignarAlumnoCurso extends javax.swing.JFrame {

    /**
     * Creates new form AsignarAlumnoCurso
     */
    public AsignarAlumnoCurso() {
        initComponents();

        DefaultComboBoxModel<String> cursos = new DefaultComboBoxModel<>();
        cursos.addElement("");
        for (Curso curso : LoginA.cursos) {
            cursos.addElement(curso.nombre);
        }
        jComboBox1.setModel(cursos);

        DefaultComboBoxModel<String> alumnos = new DefaultComboBoxModel<>();
        alumnos.addElement("");
        for (Alumno alumno : LoginA.alumnos) {
            alumnos.addElement(alumno.nombre);
        }
        jComboBox2.setModel(alumnos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Alumno:");

        jLabel2.setText("Curso:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Asignar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Administrador a = new Administrador();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Curso cursoSelect = null;
        Alumno alumnoSelect = null;

        for (Curso curso : LoginA.cursos) {
            if (curso.nombre.equals(jComboBox1.getSelectedItem().toString())) {
                cursoSelect = curso;
                break;
            }
        }
        

        for (Alumno alumno : LoginA.alumnos) {
            if (alumno.nombre.equals(jComboBox2.getSelectedItem().toString())) {
                alumnoSelect = alumno;
                break;
            }
        }

        if (alumnoSelect != null && cursoSelect != null) {
            
            if (cursoSelect.alumnos.size() < 10) {
                if (alumnoSelect.cursos.size() < 5) {
                    cursoSelect.alumnos.add(alumnoSelect);
                    alumnoSelect.cursos.add(cursoSelect);
                    JOptionPane.showMessageDialog(this, "Alumno asignado exitosamente al curso de " + cursoSelect.getNombre());
                } else {
                    JOptionPane.showMessageDialog(this, "El alumno alcanzó el máximo de cursos asignados");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay cupos disponibles en este curso");
            }

            DefaultComboBoxModel<String> cursos = new DefaultComboBoxModel<>();
            cursos.addElement("");
            for (Curso curso : LoginA.cursos) {
                cursos.addElement(curso.nombre);
            }
            jComboBox1.setModel(cursos);

            DefaultComboBoxModel<String> alumnos = new DefaultComboBoxModel<>();
            alumnos.addElement("");
            for (Alumno alumno : LoginA.alumnos) {
                alumnos.addElement(alumno.nombre);
            }
            jComboBox2.setModel(alumnos);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
