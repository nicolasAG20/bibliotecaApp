/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package biblioteca.views;

import biblioteca.models.Biblioteca;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Modelo que representa la ventana de EliminarLibro
 * @author Camila
 * @since 20250312
 * @version 1.0
 */
public class EliminarLibro extends javax.swing.JDialog {
    //Atributos 
    /**
    * Instancia de Biblioteca
    */
    private Biblioteca biblioteca;
    /**
    * Instancia de VentanaPrincipal
    */
    private VentanaPrincipal ventana;
    
    /**
     * Inicializa los atributos de la clase EliminarLibro
     *
     * @param     parent
     * @param     modal
     * @param     biblioteca
     * @param     ventana
    */
    public EliminarLibro(java.awt.Frame parent, boolean modal,Biblioteca biblioteca, VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.biblioteca = biblioteca;
        this.ventana = ventana;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        btnEliminarLibro = new javax.swing.JPanel();
        txtElimi = new javax.swing.JLabel();
        iconoElimi = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textoPreguntarIdLibroEliminar = new javax.swing.JLabel();
        txtIdLibroEliminar = new javax.swing.JTextField();
        btnMostrarLibros = new javax.swing.JPanel();
        textoMostrarLibros = new javax.swing.JLabel();
        panelTitulo1 = new javax.swing.JPanel();
        textoEliminar = new javax.swing.JLabel();
        iconoEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelContenido.setBackground(new java.awt.Color(213, 183, 247));

        btnEliminarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseExited(evt);
            }
        });

        txtElimi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtElimi.setText("Eliminar Libro");

        iconoElimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/completado.png"))); // NOI18N

        javax.swing.GroupLayout btnEliminarLibroLayout = new javax.swing.GroupLayout(btnEliminarLibro);
        btnEliminarLibro.setLayout(btnEliminarLibroLayout);
        btnEliminarLibroLayout.setHorizontalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtElimi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(iconoElimi)
                .addGap(8, 8, 8))
        );
        btnEliminarLibroLayout.setVerticalGroup(
            btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                .addGroup(btnEliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtElimi))
                    .addGroup(btnEliminarLibroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(iconoElimi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtEliminar.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        txtEliminar.setText("Eliminar");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        textoPreguntarIdLibroEliminar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoPreguntarIdLibroEliminar.setText("Ingrese el id del libro que desea eliminar: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textoPreguntarIdLibroEliminar)
                .addGap(18, 18, 18)
                .addComponent(txtIdLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPreguntarIdLibroEliminar)
                    .addComponent(txtIdLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnMostrarLibros.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseExited(evt);
            }
        });

        textoMostrarLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoMostrarLibros.setText("Mostrar libros");

        javax.swing.GroupLayout btnMostrarLibrosLayout = new javax.swing.GroupLayout(btnMostrarLibros);
        btnMostrarLibros.setLayout(btnMostrarLibrosLayout);
        btnMostrarLibrosLayout.setHorizontalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textoMostrarLibros)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btnMostrarLibrosLayout.setVerticalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMostrarLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoMostrarLibros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelTitulo1.setBackground(new java.awt.Color(193, 138, 255));

        textoEliminar.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        textoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        textoEliminar.setText("Eliminar libro");

        iconoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/eliminarLibro.png"))); // NOI18N

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoEliminar)
                .addGap(48, 48, 48))
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento del boton eliminarLibro al hacer click
     *
     * @param     evt
    */
    private void btnEliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseClicked
        try{
            long idLibro = Long.parseLong(this.txtIdLibroEliminar.getText());
            boolean encontrado = this.biblioteca.eliminarLibro(idLibro);
            if (encontrado){
                JOptionPane.showMessageDialog(this, "Libro eliminado con exito");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Libro no encontrado, ingreselo de nuevo");
                this.txtIdLibroEliminar.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero");
            this.txtIdLibroEliminar.setText("");
        }
    }//GEN-LAST:event_btnEliminarLibroMouseClicked

    private void btnEliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseEntered
        this.mouseEntered(btnEliminarLibro);
    }//GEN-LAST:event_btnEliminarLibroMouseEntered

    private void btnEliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseExited
        this.mouseExited(btnEliminarLibro);
    }//GEN-LAST:event_btnEliminarLibroMouseExited

    private void btnMostrarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }else{
            MostrarLibros ventanaMostrarLibros = new MostrarLibros (this.ventana, true, this.biblioteca, this.ventana);
            ventanaMostrarLibros.setVisible (true);
        }
    }//GEN-LAST:event_btnMostrarLibrosMouseClicked

    private void btnMostrarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseEntered
        this.mouseEntered(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseEntered

    private void btnMostrarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseExited
        this.mouseExited(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseExited

    /**
     * Metodo para cambiar el color del boton
     * @param     evt
    */
    private void mouseEntered (JPanel panel){
        panel.setBackground(new Color (207, 240, 255));
    }

    /**
     * Metodo para cambiar el color del boton
     * @param     evt
    */
    private void mouseExited (JPanel panel){
        panel.setBackground(Color.white);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEliminarLibro;
    private javax.swing.JPanel btnMostrarLibros;
    private javax.swing.JLabel iconoElimi;
    private javax.swing.JLabel iconoEliminar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JLabel textoEliminar;
    private javax.swing.JLabel textoMostrarLibros;
    private javax.swing.JLabel textoPreguntarIdLibroEliminar;
    private javax.swing.JLabel txtElimi;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JTextField txtIdLibroEliminar;
    // End of variables declaration//GEN-END:variables
}
