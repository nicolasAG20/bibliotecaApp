/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package biblioteca.views;

import biblioteca.models.Biblioteca;
import biblioteca.models.Libro;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Modelo que representa la ventana de actualizar libro
 * @author Camila
 * @since 20250312
 * @version 1.0
 */

public class ActualizarLibro extends javax.swing.JDialog {
    //Atributos 
    /**
    * Instancia de Biblioteca
    */
    private Biblioteca biblioteca;
    /**
    * Instancia de VentanaPrincipal
    */
    private MostrarLibros ventanaMostrar; 
    private VentanaPrincipal ventana;
    
    /**
     * Inicializa los atributos de la clase ActualizarLibro
     *
     * @param     parent
     * @param     modal
     * @param     biblioteca
     * @param     ventana
    */
    public ActualizarLibro(java.awt.Frame parent, boolean modal, Biblioteca biblioteca, VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.biblioteca = biblioteca;
        this.ventana = ventana;
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo1 = new javax.swing.JPanel();
        textoActualizarLibro = new javax.swing.JLabel();
        iconoActualizarLibro = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        btnActualizarLibro = new javax.swing.JPanel();
        txtActu = new javax.swing.JLabel();
        iconoActua = new javax.swing.JLabel();
        txtActualizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtIdLibroActualizar = new javax.swing.JTextField();
        textoPreguntarIdLibroActualizar1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textoNuevoId = new javax.swing.JLabel();
        txtNuevoId = new javax.swing.JTextField();
        textoNuevoTitulo = new javax.swing.JLabel();
        txtNuevoTitulo = new javax.swing.JTextField();
        btnMostrarLibros = new javax.swing.JPanel();
        textoMostrarLibros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelTitulo1.setBackground(new java.awt.Color(193, 138, 255));

        textoActualizarLibro.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        textoActualizarLibro.setForeground(new java.awt.Color(255, 255, 255));
        textoActualizarLibro.setText("Actualizar libro");

        iconoActualizarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/actualizarLibro.png"))); // NOI18N

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textoActualizarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconoActualizarLibro)
                .addGap(48, 48, 48))
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconoActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenido.setBackground(new java.awt.Color(213, 183, 247));

        btnActualizarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseExited(evt);
            }
        });

        txtActu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtActu.setText("Actualizar libro");

        iconoActua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/completado.png"))); // NOI18N

        javax.swing.GroupLayout btnActualizarLibroLayout = new javax.swing.GroupLayout(btnActualizarLibro);
        btnActualizarLibro.setLayout(btnActualizarLibroLayout);
        btnActualizarLibroLayout.setHorizontalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtActu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(iconoActua)
                .addGap(5, 5, 5))
        );
        btnActualizarLibroLayout.setVerticalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addGroup(btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtActu))
                    .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(iconoActua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtActualizar.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        txtActualizar.setText("Actualizar");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        textoPreguntarIdLibroActualizar1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoPreguntarIdLibroActualizar1.setText("Ingrese el id del libro que desea actualizar: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textoPreguntarIdLibroActualizar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdLibroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPreguntarIdLibroActualizar1)
                    .addComponent(txtIdLibroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        textoNuevoId.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoNuevoId.setText("Ingrese el nuevo id: ");

        textoNuevoTitulo.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoNuevoTitulo.setText("Ingrese el nuevo titulo: ");

        txtNuevoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNuevoTitulo)
                    .addComponent(textoNuevoId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNuevoId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNuevoId)
                    .addComponent(txtNuevoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNuevoTitulo)
                    .addComponent(txtNuevoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addContainerGap(36, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento del boton actualizarLibro al hacer click
     *
     * @param     evt
    */
    private void btnActualizarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseClicked
        String nuevoTitulo = this.txtNuevoTitulo.getText();
        try{
            long idLibro = Long.parseLong(this.txtIdLibroActualizar.getText());
            long nuevoId = Long.parseLong(this.txtNuevoId.getText());
            Libro libroActualizar = new Libro (nuevoId, nuevoTitulo);
            boolean actualizado = this.biblioteca.actualizarLibro(idLibro, libroActualizar);
            if (actualizado){
                JOptionPane.showMessageDialog(this, "Libro actualizado con exito");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el libro, intentelo de nuevo");
                this.txtIdLibroActualizar.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero");
            this.txtIdLibroActualizar.setText("");
            this.txtNuevoId.setText("");
        }
    }//GEN-LAST:event_btnActualizarLibroMouseClicked

    private void btnActualizarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseEntered
        this.mouseEntered(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseEntered
        
    private void btnActualizarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseExited
        this.mouseExited(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseExited

    private void txtNuevoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoTituloActionPerformed
       
    }//GEN-LAST:event_txtNuevoTituloActionPerformed

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
    private javax.swing.JPanel btnActualizarLibro;
    private javax.swing.JPanel btnMostrarLibros;
    private javax.swing.JLabel iconoActua;
    private javax.swing.JLabel iconoActualizarLibro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JLabel textoActualizarLibro;
    private javax.swing.JLabel textoMostrarLibros;
    private javax.swing.JLabel textoNuevoId;
    private javax.swing.JLabel textoNuevoTitulo;
    private javax.swing.JLabel textoPreguntarIdLibroActualizar1;
    private javax.swing.JLabel txtActu;
    private javax.swing.JLabel txtActualizar;
    private javax.swing.JTextField txtIdLibroActualizar;
    private javax.swing.JTextField txtNuevoId;
    private javax.swing.JTextField txtNuevoTitulo;
    // End of variables declaration//GEN-END:variables
}
