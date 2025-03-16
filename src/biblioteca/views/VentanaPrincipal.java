/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.views;

import biblioteca.models.Biblioteca;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Modelo que representa la ventana de actualizar libro
 * @author Camila
 * @since 20250312
 * @version 1.0
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    //Atributos 
    /**
    * Instancia de Biblioteca
    */
    private Biblioteca biblioteca = new Biblioteca();
    
    /**
     * Inicializa los atributos de la clase VentanaPrincipal
     *
     * @param     biblioteca
    */   
    public VentanaPrincipal(Biblioteca biblioteca) {
        initComponents();
        this.biblioteca = biblioteca;
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textoBiblioteca = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        btnAgregarLibro = new javax.swing.JPanel();
        iconoAgregarLibro = new javax.swing.JLabel();
        textoAgregarLibro = new javax.swing.JLabel();
        textoBienvenidos = new javax.swing.JLabel();
        btnActualizarLibro = new javax.swing.JPanel();
        iconoActualizarLibro = new javax.swing.JLabel();
        textoActualizarLibro = new javax.swing.JLabel();
        eliminarLibro = new javax.swing.JPanel();
        iconoEliminarLibro = new javax.swing.JLabel();
        textoEliminarLibro1 = new javax.swing.JLabel();
        btnBuscarLibro = new javax.swing.JPanel();
        iconoBuscarLibro = new javax.swing.JLabel();
        textoBuscarLibro = new javax.swing.JLabel();
        btnMostrarLibros = new javax.swing.JPanel();
        textoMostrarLibros = new javax.swing.JLabel();
        iconoVerLibros = new javax.swing.JLabel();
        btnMostrarLibrosAlfabeticamente = new javax.swing.JPanel();
        textoMostrarLibros1 = new javax.swing.JLabel();
        iconoVerLibros1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelTitulo.setBackground(new java.awt.Color(193, 138, 255));

        textoBiblioteca.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        textoBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        textoBiblioteca.setText("Biblioteca");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(textoBiblioteca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textoBiblioteca)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelContenido.setBackground(new java.awt.Color(198, 208, 229));

        btnAgregarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseExited(evt);
            }
        });

        iconoAgregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/agregarLibro.png"))); // NOI18N

        textoAgregarLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textoAgregarLibro.setText("Agregar libro");

        javax.swing.GroupLayout btnAgregarLibroLayout = new javax.swing.GroupLayout(btnAgregarLibro);
        btnAgregarLibro.setLayout(btnAgregarLibroLayout);
        btnAgregarLibroLayout.setHorizontalGroup(
            btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLibroLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoAgregarLibro)
                    .addComponent(iconoAgregarLibro))
                .addGap(15, 15, 15))
        );
        btnAgregarLibroLayout.setVerticalGroup(
            btnAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoAgregarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoAgregarLibro)
                .addContainerGap())
        );

        textoBienvenidos.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        textoBienvenidos.setText("Bienvenido");

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

        iconoActualizarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/actualizarLibro.png"))); // NOI18N

        textoActualizarLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textoActualizarLibro.setText("Actualizar libro");

        javax.swing.GroupLayout btnActualizarLibroLayout = new javax.swing.GroupLayout(btnActualizarLibro);
        btnActualizarLibro.setLayout(btnActualizarLibroLayout);
        btnActualizarLibroLayout.setHorizontalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addGroup(btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoActualizarLibro))
                    .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(iconoActualizarLibro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnActualizarLibroLayout.setVerticalGroup(
            btnActualizarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoActualizarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoActualizarLibro))
        );

        eliminarLibro.setBackground(new java.awt.Color(255, 255, 255));
        eliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarLibroMouseExited(evt);
            }
        });

        iconoEliminarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/eliminarLibro.png"))); // NOI18N

        textoEliminarLibro1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textoEliminarLibro1.setText("Eliminar libro");

        javax.swing.GroupLayout eliminarLibroLayout = new javax.swing.GroupLayout(eliminarLibro);
        eliminarLibro.setLayout(eliminarLibroLayout);
        eliminarLibroLayout.setHorizontalGroup(
            eliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarLibroLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(eliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoEliminarLibro1)
                    .addComponent(iconoEliminarLibro))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        eliminarLibroLayout.setVerticalGroup(
            eliminarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoEliminarLibro)
                .addGap(12, 12, 12)
                .addComponent(textoEliminarLibro1))
        );

        btnBuscarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseExited(evt);
            }
        });

        iconoBuscarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/buscarLibro.png"))); // NOI18N

        textoBuscarLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textoBuscarLibro.setText("Buscar Libro");

        javax.swing.GroupLayout btnBuscarLibroLayout = new javax.swing.GroupLayout(btnBuscarLibro);
        btnBuscarLibro.setLayout(btnBuscarLibroLayout);
        btnBuscarLibroLayout.setHorizontalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textoBuscarLibro))
                    .addComponent(iconoBuscarLibro))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btnBuscarLibroLayout.setVerticalGroup(
            btnBuscarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoBuscarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBuscarLibro))
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

        textoMostrarLibros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoMostrarLibros.setText("Mostrar libros");

        iconoVerLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/verLibros (2).png"))); // NOI18N

        javax.swing.GroupLayout btnMostrarLibrosLayout = new javax.swing.GroupLayout(btnMostrarLibros);
        btnMostrarLibros.setLayout(btnMostrarLibrosLayout);
        btnMostrarLibrosLayout.setHorizontalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoMostrarLibros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(iconoVerLibros)
                .addContainerGap())
        );
        btnMostrarLibrosLayout.setVerticalGroup(
            btnMostrarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMostrarLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoMostrarLibros)
                .addContainerGap(7, Short.MAX_VALUE))
            .addComponent(iconoVerLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnMostrarLibrosAlfabeticamente.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarLibrosAlfabeticamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfabeticamenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfabeticamenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosAlfabeticamenteMouseExited(evt);
            }
        });

        textoMostrarLibros1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoMostrarLibros1.setText("Mostrar libros en orden alfabetico");

        iconoVerLibros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/verLibros (2).png"))); // NOI18N

        javax.swing.GroupLayout btnMostrarLibrosAlfabeticamenteLayout = new javax.swing.GroupLayout(btnMostrarLibrosAlfabeticamente);
        btnMostrarLibrosAlfabeticamente.setLayout(btnMostrarLibrosAlfabeticamenteLayout);
        btnMostrarLibrosAlfabeticamenteLayout.setHorizontalGroup(
            btnMostrarLibrosAlfabeticamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarLibrosAlfabeticamenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoMostrarLibros1)
                .addGap(25, 25, 25)
                .addComponent(iconoVerLibros1)
                .addGap(21, 21, 21))
        );
        btnMostrarLibrosAlfabeticamenteLayout.setVerticalGroup(
            btnMostrarLibrosAlfabeticamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMostrarLibrosAlfabeticamenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoMostrarLibros1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnMostrarLibrosAlfabeticamenteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(iconoVerLibros1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(eliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoBienvenidos)
                    .addComponent(btnMostrarLibrosAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(textoBienvenidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarLibrosAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crea instancia de clase AgregarLibro y la hace visible
     *
     * @param     evt
    */
    private void btnAgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseClicked
        AgregarLibro ventanaAgregarLibro = new AgregarLibro (this, true, this.biblioteca, this);
        ventanaAgregarLibro.setVisible(true);
    }//GEN-LAST:event_btnAgregarLibroMouseClicked

    /**
     * Evento del boton agregarLibro al entrar el mouse
     * @param     evt
    */
    private void btnAgregarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseEntered
        this.mouseEntered(btnAgregarLibro);
    }//GEN-LAST:event_btnAgregarLibroMouseEntered

    /**
     * Evento del boton agregarrLibro al salir el mouse
     * @param     evt
    */
    private void btnAgregarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseExited
        this.mouseExited(btnAgregarLibro);
    }//GEN-LAST:event_btnAgregarLibroMouseExited

    /**
     * Crea instancia de clase ActualizarLibro y la hace visible
     *
     * @param     evt
    */
    private void btnActualizarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }
        else{
            ActualizarLibro ventanaActualizarLibro = new ActualizarLibro (this, true, this.biblioteca, this);
            ventanaActualizarLibro.setVisible (true);
        }
    }//GEN-LAST:event_btnActualizarLibroMouseClicked

    /**
     * Evento del boton actualizarLibro al entrar el mouse
     * @param     evt
    */
    private void btnActualizarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseEntered
        this.mouseEntered(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseEntered

    /**
     * Evento del boton actualizarLibro al salir el mouse
     * @param     evt
    */
    private void btnActualizarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseExited
        this.mouseExited(btnActualizarLibro);
    }//GEN-LAST:event_btnActualizarLibroMouseExited

    /**
     * Crea instancia de clase EliminarLibro y la hace visible
     *
     * @param     evt
    */
    private void eliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLibroMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }
        else{
            EliminarLibro ventanaEliminarLibro = new EliminarLibro (this, true, this.biblioteca, this);
            ventanaEliminarLibro.setVisible (true);
        }
    }//GEN-LAST:event_eliminarLibroMouseClicked

    /**
     * Evento del boton eliminarLibro al entrar el mouse
     * @param     evt
    */
    private void eliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLibroMouseEntered
        this.mouseEntered(eliminarLibro);
    }//GEN-LAST:event_eliminarLibroMouseEntered

    /**
     * Evento del boton eliminarLibro al salir el mouse
     * @param     evt
    */
    private void eliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLibroMouseExited
        this.mouseExited(eliminarLibro);
    }//GEN-LAST:event_eliminarLibroMouseExited

    /**
     * Crea instancia de clase BuscarLibro y la hace visible
     *
     * @param     evt
    */
    private void btnBuscarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }
        else{
            BuscarLibro ventanaBuscarLibro = new BuscarLibro (this, true, this.biblioteca, this);
            ventanaBuscarLibro.setVisible (true);
        }
    }//GEN-LAST:event_btnBuscarLibroMouseClicked

    /**
     * Evento del boton buscarLibro al entrar el mouse
     * @param     evt
    */
    private void btnBuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseEntered
        this.mouseEntered(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseEntered

    /**
     * Evento del boton buscarLibro al salir el mouse
     * @param     evt
    */
    private void btnBuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseExited
        this.mouseExited(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseExited

    /**
     * Crea instancia de clase MostrarLibros y la hace visible
     *
     * @param     evt
    */
    private void btnMostrarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }else{
            MostrarLibros ventanaMostrarLibros = new MostrarLibros (this, true, this.biblioteca, this);
            ventanaMostrarLibros.setVisible (true);
        }
    }//GEN-LAST:event_btnMostrarLibrosMouseClicked

    /**
     * Evento del boton mostrarLibros al entrar el mouse
     * @param     evt
    */
    private void btnMostrarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseEntered
        this.mouseEntered(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseEntered

    /**
     * Evento del boton mostrarLibros al salir el mouse
     * @param     evt
    */
    private void btnMostrarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseExited
        this.mouseExited(btnMostrarLibros);
    }//GEN-LAST:event_btnMostrarLibrosMouseExited
    
    /**
     * Crea instancia de clase MostrarAlfabeticamente y la hace visible
     *
     * @param     evt
    */
    private void btnMostrarLibrosAlfabeticamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfabeticamenteMouseClicked
        if(this.biblioteca.getLibros().size() == 0){
            JOptionPane.showMessageDialog(this, "Debe agregar un libro primero");
        }else{
            MostrarAlfabeticamente ventanaMostrarAlfabeticamente = new MostrarAlfabeticamente (this, true, this.biblioteca, this);
            ventanaMostrarAlfabeticamente.setVisible (true);
        }
    }//GEN-LAST:event_btnMostrarLibrosAlfabeticamenteMouseClicked
 
    /**
     * Evento del boton mostrarAlfabeticamente al entrar el mouse
     * @param     evt
    */
    private void btnMostrarLibrosAlfabeticamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfabeticamenteMouseEntered
       this.mouseEntered(btnMostrarLibrosAlfabeticamente);
    }//GEN-LAST:event_btnMostrarLibrosAlfabeticamenteMouseEntered

    /**
     * Evento del boton mostrarAlfabeticamente al salir el mouse
     * @param     evt
    */
    private void btnMostrarLibrosAlfabeticamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosAlfabeticamenteMouseExited
        this.mouseExited(btnMostrarLibrosAlfabeticamente);
    }//GEN-LAST:event_btnMostrarLibrosAlfabeticamenteMouseExited

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
    private javax.swing.JPanel btnAgregarLibro;
    private javax.swing.JPanel btnBuscarLibro;
    private javax.swing.JPanel btnMostrarLibros;
    private javax.swing.JPanel btnMostrarLibrosAlfabeticamente;
    private javax.swing.JPanel eliminarLibro;
    private javax.swing.JLabel iconoActualizarLibro;
    private javax.swing.JLabel iconoAgregarLibro;
    private javax.swing.JLabel iconoBuscarLibro;
    private javax.swing.JLabel iconoEliminarLibro;
    private javax.swing.JLabel iconoVerLibros;
    private javax.swing.JLabel iconoVerLibros1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel textoActualizarLibro;
    private javax.swing.JLabel textoAgregarLibro;
    private javax.swing.JLabel textoBiblioteca;
    private javax.swing.JLabel textoBienvenidos;
    private javax.swing.JLabel textoBuscarLibro;
    private javax.swing.JLabel textoEliminarLibro1;
    private javax.swing.JLabel textoMostrarLibros;
    private javax.swing.JLabel textoMostrarLibros1;
    // End of variables declaration//GEN-END:variables
}
