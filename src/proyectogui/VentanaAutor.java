/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectogui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import proyectogui.Archivos.AventuraLibro;

/**
 *
 * @author edgar
 */
public class VentanaAutor extends javax.swing.JFrame {
    private JFrame ventanaPrincipal;
    ArrayList <AventuraLibro> listaLibros = new ArrayList<>(); 
    
    /**
     * Creates new form VentanaAutor
     * @param _username
     * @param _ventana
     * @param _listaLibros
     */
    public VentanaAutor(String _username, JFrame _ventana, ArrayList _listaLibros) {
        listaLibros = _listaLibros;
        setTitle("Creador de libros");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                ventanaPrincipal.setVisible(true);
            }
        });
        
        initComponents();
        ventanaPrincipal = _ventana;
        inicializarlbl(_username);
    }

    public void inicializarlbl(String _username){
        this.lblNombre.setText(_username);
    }
    
    public void regresar(JFrame _ventana){
        setVisible(false);
        _ventana.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblicon1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnAddPaginas = new javax.swing.JButton();
        btnCrearLibro1 = new javax.swing.JButton();
        lblicon2 = new javax.swing.JLabel();
        lblicon3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setResizable(false);

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/Imagenes/persona.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btnAddPaginas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAddPaginas.setText("Agregar Paginas");
        btnAddPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPaginasActionPerformed(evt);
            }
        });

        btnCrearLibro1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCrearLibro1.setText("Crear Libro");
        btnCrearLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLibro1ActionPerformed(evt);
            }
        });

        lblicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/Imagenes/paginas.png"))); // NOI18N

        lblicon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/Imagenes/libro.png"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblicon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblicon2)
                            .addComponent(lblicon3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrearLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAddPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblicon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(lblicon2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPaginasActionPerformed
        VentanaAgregarPaginas nuevasPaginas = new VentanaAgregarPaginas(this,listaLibros);
        nuevasPaginas.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAddPaginasActionPerformed

    private void btnCrearLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLibro1ActionPerformed
        VentanaCrearLibro nuevoLibro = new VentanaCrearLibro(this,listaLibros);
        nuevoLibro.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCrearLibro1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        regresar(ventanaPrincipal);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPaginas;
    private javax.swing.JButton btnCrearLibro1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblicon2;
    private javax.swing.JLabel lblicon3;
    // End of variables declaration//GEN-END:variables
}
